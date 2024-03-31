package com.example.effectivejava.ch3.item14;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Parent(1, "Parent");
        Child child = new Child(parent, 1);
        Child otherChild = new Child(parent, 2);
        Child sameChild = new Child(parent, 1);

        System.out.println(child.compareTo(otherChild));
        System.out.println(child.equals(otherChild));

        System.out.println(child.compareTo(sameChild));
        System.out.println(child.equals(sameChild));
    }
}
