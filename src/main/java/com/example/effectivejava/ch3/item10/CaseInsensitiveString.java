package com.example.effectivejava.ch3.item10;

import java.util.Objects;

public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(final String s) {
        // final 로 null 을 검사할지, requireNonNull 로 검사할지 결정
        // final 은 컴파일 타임에서, requireNonNull 은 런타임에서 NPE 발생 가능
        // final 이 더 안전하지 않을까?
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) {
        // String 객체는 비교 대상이 될 수 없다.
        // 대칭성을 위배하기 때문
        return o instanceof CaseInsensitiveString &&
                s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
    }

    // 대칭성 위배 equals
    /*@Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }*/

    public String getS() {
        return s;
    }
}
