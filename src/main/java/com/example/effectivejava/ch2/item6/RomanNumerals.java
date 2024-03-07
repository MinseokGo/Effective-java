package com.example.effectivejava.ch2.item6;

import java.util.regex.Pattern;

public class RomanNumerals {
    // Pattern 은 입력 받은 정규표현식에 해당하는 유한 상태 며신을 만들기 때문에 인스턴스 생성 비용이 높다.
    // 그러므로 클래스 초기화 과정에서 인스턴스를 직접 생성해서 캐싱해둠
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(final String number) {
        // Pattern 인스턴스 재사용
        return ROMAN.matcher(number)
                .matches();
    }
}
