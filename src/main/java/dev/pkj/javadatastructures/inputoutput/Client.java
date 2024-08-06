package dev.pkj.javadatastructures.inputoutput;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a+b) + " " + (a-b) + " " + (a*b) + " " + (a/b));
    }
}
