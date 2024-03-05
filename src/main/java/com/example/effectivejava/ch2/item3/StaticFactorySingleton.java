package com.example.effectivejava.ch2.item3;

public class StaticFactorySingleton {
    private static final StaticFactorySingleton INSTANCE = new StaticFactorySingleton();

    // 싱글턴 보장을 위해 생성자는 private
    // 리플렉션 API 로 뚫을 수는 있음
    private StaticFactorySingleton() {
    }

    public static StaticFactorySingleton getInstance() {
        return INSTANCE;
    }
}
