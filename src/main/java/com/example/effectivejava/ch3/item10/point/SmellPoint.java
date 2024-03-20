package com.example.effectivejava.ch3.item10.point;

public class SmellPoint extends Point {
    private final Smell smell;

    public SmellPoint(final int x, final int y, final Smell smell) {
        super(x, y);
        this.smell = smell;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }

        if (!(o instanceof SmellPoint)) {
            return o.equals(this);
        }

        return super.equals(o) && ((SmellPoint) o).smell == smell;
    }
}
