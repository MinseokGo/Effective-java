package com.example.effectivejava.ch2.item3;

// enum 은 멤버를 만들 때 private 으로 한번만 초기화하므로 Thread-Safe
// 멤버를 선언할 수 있어 독립된 싱글톤 클래스처럼 사용 가능
// enum 은 Serializable 인터페이스를 구현하고 있어 직렬화 또한 가능
// enum 이 아닌 다른 클래스는 상속이 불가능하기 때문에 다른 클래스 상속이 필요하면 일반 클래스로 싱글톤을 구현해야한다
// interface 구현은 가능하다
public enum EnumSingleton {
    INSTANCE;

    // enum 은 멤버 필드를 가질 수 있다
    private int data;

    // 메서드 또한 작성할 수 있다.
    public void enumSingletonMethod() {
        System.out.println("Enum Singleton!!");
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.enumSingletonMethod();
    }
}
