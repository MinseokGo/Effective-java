package com.example.effectivejava.ch3.item14;

public final class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {
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

    /* 포맷 명시
     * 이 전화번호의 문자열 표현을 반환한다.
     * 이 문자열은 "XXX-YYY-ZZZ" 형태의 9글자로 구성된다.
     * XXX 는 지역 코드, YYY 는 프리픽스, ZZZ 는 가입자 번호다.
     * 각각의 대문자(X, Y, Z)는 10진수 숫자 하나를 가리킨다.
     *
     * 전화번호의 각 부분의 값이 너무 작아서 자릿수를 채울 수 없다면,
     * 앞에서부터 0으로 채워나간다. 예컨대 가입자 번호가 12 라면
     * 전화번호의 마지막 세 문자는 "012" 가 된다.
     */
    @Override
    public String toString() {
        return String.format("%03d-%03d-%03d", areaCode, prefix, lineNumber);
    }

    @Override
    public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(PhoneNumber other) {
        int result = Short.compare(areaCode, other.areaCode);
        if (result == 0) {
            result = Short.compare(prefix, other.prefix);
            if (result == 0) {
                result = Short.compare(lineNumber, other.lineNumber);
            }
        }
        return result;
    }
}
