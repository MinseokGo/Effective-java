package com.example.effectivejava.ch2.item3;

import java.io.Serial;
import java.io.Serializable;

// 역직렬화 시 새로운 객체를 생성하므로 싱글톤이 보장되지 않음
// 이럴 때는 모든 인스턴스 필드를 transient 선언하고
// readResolve 메서드 제공
public class SerializableSingleton implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static final SerializableSingleton INSTANCE = new SerializableSingleton();

    transient int data;

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    // 역직렬화 시 새로운 객체가 생성되지만, readResolve 를 통해 싱글톤 인스턴스를 반환
    // 새로운 객체는 GC에 의해 관리됨
    @Serial
    private Object readResolve() {
        return INSTANCE;
    }
}
