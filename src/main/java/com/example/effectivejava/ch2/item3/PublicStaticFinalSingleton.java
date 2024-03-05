package com.example.effectivejava.ch2.item3;

/*
* item3 : private 생성자나 열거 타입으로 싱글턴임을 보증하라
*/
public class PublicStaticFinalSingleton {
    // PublicStaticFinalSingleton.INSTANCE 를 통해 싱글턴 인스턴스에 직접 접근한다.
    public static final PublicStaticFinalSingleton INSTANCE = new PublicStaticFinalSingleton();

    private PublicStaticFinalSingleton() {
    }
}
