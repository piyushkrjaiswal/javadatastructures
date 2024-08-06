package dev.pkj.javadatastructures.general;

public class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber y) {
        int sumReal = real + y.real;
        int sumImaginary = imaginary + y.imaginary;

        ComplexNumber z = new ComplexNumber(sumReal, sumImaginary);
        return z;
    }

    public String toString() {
        return real + " " + "+" + " " + imaginary + "i";
    }
}
