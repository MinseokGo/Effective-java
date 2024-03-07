package com.example.effectivejava.ch2.item6;

public class RomanMain {
    public static void main(String[] args) {
        final boolean isRomanNumeral = RomanNumerals.isRomanNumeral("IVIVIVIVIV");
        System.out.println("isRomanNumeral = " + isRomanNumeral);
    }
}
