package dev.pkj.javadatastructures.general;

public class classObject {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(20, 10);
        System.out.println(complexNumber);

        ComplexNumber complexNumber1 = new ComplexNumber(3, -8);
        System.out.println(complexNumber1);

        ComplexNumber z = complexNumber.add(complexNumber1);
        System.out.println(z);
    }
}
