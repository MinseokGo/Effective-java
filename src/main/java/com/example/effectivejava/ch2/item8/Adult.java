package com.example.effectivejava.ch2.item8;

public class Adult {
    public static void main(String[] args) {
        // try-with-resources 시 Room 객체 내부의 close() 는 필요하지 않다.
        try (Room myRoom = new Room(7)) {
            System.out.println("내 방");
        }
    }
}
