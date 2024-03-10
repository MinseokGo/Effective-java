package com.example.effectivejava.ch2.item8;

public class Teenager {
    public static void main(String[] args) {
        Room myRoom = new Room(5);
        System.out.println("내 방은 직접 청소한다.");

        // Cleaner 는 gc 에 의해 참조 회수되는 것이 보장되지 않는다.
        // close() 하지 않으면 객체 참조 회수가 안된다.
        myRoom.close();

        // 내 로컬 기준 객체 참조 회수 안됨
        System.gc();
    }
}
