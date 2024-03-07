package com.example.effectivejava.ch2.item5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
* item5 : 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라
*/
public class SpellChecker {
    private final Dictionary dictionary;

    // DI
    public SpellChecker(final Dictionary dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public static boolean isValid(final String word) {
        return true;
    }

    public static List<String> suggestions(final String typo) {
        return new ArrayList<>();
    }
}
