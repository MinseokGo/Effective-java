package com.example.effectivejava.ch3.item10.point;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint {
    private static final AtomicInteger COUNTER =  new AtomicInteger();

    private final Point point;

    public CounterPoint(final int x, final int y) {
        point = new Point(x, y);
        COUNTER.incrementAndGet();
    }

    public Point asPoint() {
        return point;
    }

    public static int numberCreated() {
        return COUNTER.get();
    }
}
