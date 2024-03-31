package com.example.effectivejava.ch3.item14;

public class Child implements Comparable<Child> {
    private final Parent parent;
    private final int order;

    public Child(final Parent parent, final int order) {
        this.parent = parent;
        this.order = order;
    }

    public Parent asParent() {
        return parent;
    }

    @Override
    public int compareTo(Child child) {
        final int result = Integer.compare(parent.getId(), child.parent.getId());
        if (result != 0) {
            return result;
        }

        return Integer.compare(order, child.order);
    }
}
