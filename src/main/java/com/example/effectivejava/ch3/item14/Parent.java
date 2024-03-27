package com.example.effectivejava.ch3.item14;

public class Parent implements Comparable<Parent> {
    private final int id;
    private final String name;

    public Parent(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Parent other) {
        return Integer.compare(id, other.id);
    }
}