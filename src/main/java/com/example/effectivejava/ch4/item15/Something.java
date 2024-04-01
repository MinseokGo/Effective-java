package com.example.effectivejava.ch4.item15;

import java.util.Arrays;
import java.util.List;

public class Something {
    private static final int[] numbers = { 1, 2, 3, 4, 5 };
    public static final List<Integer> VALUES =
            Arrays.stream(numbers)
                    .boxed()
                    .toList();  // 불변 리스트
    // 방어적 복사
    public static int[] values() {
        return numbers.clone();
    }
}
