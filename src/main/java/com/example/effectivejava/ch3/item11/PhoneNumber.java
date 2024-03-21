package com.example.effectivejava.ch3.item11;

import java.util.Objects;

public final class PhoneNumber {
    private static final short MIN_VALUE = 0;
    private static final short MAX_VALUE = 999;

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(final short areaCode, final short prefix, final short lineNumber) {
        this.areaCode = rangeCheck(areaCode, "지역 코드");
        this.prefix = rangeCheck(prefix, "프리픽스");
        this.lineNumber = rangeCheck(lineNumber, "가입자 번호");
    }

    private static short rangeCheck(final int value, final String argument) {
        if (value < MIN_VALUE || value > MAX_VALUE) {
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

    @Override
    public int hashCode() {
        int result = Short.hashCode(areaCode);
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNumber);
        return result;
    }
}
