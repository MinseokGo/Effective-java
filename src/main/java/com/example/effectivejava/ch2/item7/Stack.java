package com.example.effectivejava.ch2.item7;

import java.util.Arrays;
import java.util.EmptyStackException;

/*
* item7 : 다 쓴 객체 참조를 해제하라
*/
public class Stack {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    private Object[] elements;
    private int size = 0;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(final Object element) {
        ensureCapacity();
        elements[size++] = element;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        final Object element = elements[--size];
        elements[size] = null;  // 다 쓴 참조 해제
        return element;
    }
}
