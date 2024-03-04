package com.example.effectivejava.ch2.Item1;

/*
* item1: 생성자 대신 정적 팩터리 메서드를 고려하라
*/
public class StaticFactoryMethod {
    // 기본 생성자로 인스턴스 할당 받는 법
    public StaticFactoryMethod() {
    }

    // 정적 팩터리 메서드로 인스턴스 할당 받는 법
    public static StaticFactoryMethod getInstance() {
        return new StaticFactoryMethod();
    }
}
