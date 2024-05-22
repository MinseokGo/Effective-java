package com.example.effectivejava.ch4.item16;

public class Time {

    private static final int MIN_VALUE = 0;
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {
        if (isHourNotValid(hour)) {
            throw new IllegalArgumentException("time: " + hour);
        }
        if (isMinuteNotValid(minute)) {
            throw new IllegalArgumentException("minute: " + minute);
        }
        this.hour = hour;
        this.minute = minute;
    }

    private boolean isHourNotValid(int hour) {
        return hour < MIN_VALUE || hour >= HOURS_PER_DAY;
    }

    private boolean isMinuteNotValid(int minute) {
        return minute < MIN_VALUE || minute >= MINUTES_PER_HOUR;
    }
}
