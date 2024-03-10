package com.example.effectivejava.ch3.item10.point;

import java.awt.Color;

public class ColorPoint extends Point {
    private final Color color;
    public ColorPoint(final int x, final int y, final Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        // Point 타입의 객체가 아니면(ColorPoint 도 Point 의 하위 타입)
        if(!(o instanceof Point)) {
            return false;
        }

        // ColorPoint 객체가 아니면
        // 색상을 무시하고 비교한다. (Point 의 equals)
        if (!(o instanceof ColorPoint)) {
            return o.equals(this);
        }

        // ColorPoint 객체면 Point 값과 색상까지 비교한다.
        return super.equals(o) && ((ColorPoint) o).color == color;
    }
}
