package com.example.effectivejava.ch3.item13;

public class CloneExample {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber((short) 123, (short) 456, (short) 789);
        PhoneNumber clonePhoneNumber = phoneNumber.clone();

        System.out.println(clonePhoneNumber);
    }
}
