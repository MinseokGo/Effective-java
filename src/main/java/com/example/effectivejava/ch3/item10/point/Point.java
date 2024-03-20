package com.example.effectivejava.ch3.item10.point;

import java.util.Objects;
import java.util.Set;

public class Point {
    private static final Set<Point> unitCircle = Set.of(
            new Point(0, 1), new Point(1, 0),
            new Point(0, -1), new Point(-1, 0));

    private final int x;
    private final int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public static boolean onUnitCircle(final Point p) {
        return unitCircle.contains(p);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
