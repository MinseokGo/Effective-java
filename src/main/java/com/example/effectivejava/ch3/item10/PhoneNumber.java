package com.example.effectivejava.ch3.item10;

public final class PhoneNumber {
    private static final short MIN_VALUE = 0;

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(final short areaCode, final short prefix, final short lineNumber) {
        this.areaCode = rangeCheck(areaCode, 999, "지역 코드");
        this.prefix = rangeCheck(prefix, 999, "프리픽스");
        this.lineNumber = rangeCheck(lineNumber, 999, "가입자 번호");
    }

    private static short rangeCheck(final int value, final int max, final String argument) {
        if (value < MIN_VALUE || value > max) {
            throw new IllegalArgumentException(argument + ": " + value);
        }
        return (short) value;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof PhoneNumber phoneNumber)) {
            return false;
        }
        return phoneNumber.lineNumber == lineNumber &&
                phoneNumber.prefix == prefix &&
                phoneNumber.areaCode == areaCode;
    }
}
