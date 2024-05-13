package com.example.effectivejava.ch4.item17;

// 복소수 a + bi
public final class Complex {

    private final double realPart;
    private final double imaginaryPart;

    private Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double realPart() {
        return realPart;
    }

    public double imaginaryPart() {
        return imaginaryPart;
    }

    public Complex plus(Complex complex) {
        return new Complex(
                realPart + complex.realPart,
                imaginaryPart + complex.imaginaryPart);
    }

    public Complex minus(Complex complex) {
        return new Complex(
                realPart - complex.realPart,
                imaginaryPart - complex.imaginaryPart);
    }

    public Complex times(Complex complex) {
        return new Complex(
                realPart * complex.realPart,
                imaginaryPart * complex.imaginaryPart);
    }

    public Complex dividedBy(Complex complex) {
        double divide = complex.realPart * complex.realPart
                + complex.imaginaryPart * complex.imaginaryPart;

        return new Complex(
                (realPart * complex.realPart + imaginaryPart * complex.imaginaryPart) / divide,
                (imaginaryPart * complex.realPart - realPart * complex.imaginaryPart) / divide);
    }

    public static Complex valueOf(double realPart, double imaginaryPart) {
        return new Complex(realPart, imaginaryPart);
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Complex complex)) {
            return false;
        }

        return Double.compare(realPart, complex.realPart) == 0 &&
                Double.compare(imaginaryPart, complex.imaginaryPart) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(realPart) + Double.hashCode(imaginaryPart);
    }

    @Override
    public String toString() {
        return "(" + realPart + " + " + imaginaryPart + "i)";
    }
}
