package com.example.effectivejava.ch3.item10;

import java.util.ArrayList;
import java.util.List;

// 대칭성 : x.equals(y) 와 y.equals(x) 는 값이 같아야 함
// 대칭성 위배 코드
public class EqualsExample {
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("From");
        String s = "from";

        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis.getS()));

        List<CaseInsensitiveString> list = new ArrayList<>();
        System.out.println(list.add(cis));
    }
}
