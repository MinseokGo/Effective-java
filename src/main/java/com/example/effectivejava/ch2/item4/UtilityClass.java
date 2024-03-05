package com.example.effectivejava.ch2.item4;

public class UtilityClass {
    // 기본 생성자가 만들어지는 것을 막는다
    // 상속도 불가능하다
    // 모든 생성자는 상위 클래스의 생성자를 호출하는데 이 클래스의 하위 클래스는 이 클래스의 생성자가 private 이므로 호출할 수 없다
    private UtilityClass() {
        throw new AssertionError();
    }
}
