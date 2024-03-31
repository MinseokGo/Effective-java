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
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Child other)) {
            return false;
        }
        return parent.compareTo(other.parent) == 0 &&
                order == other.order;
    }

    @Override
    public int compareTo(Child other) {
        final int result = Integer.compare(parent.getId(), other.parent.getId());
        if (result != 0) {
            return result;
        }

        return Integer.compare(order, other.order);
    }
}
