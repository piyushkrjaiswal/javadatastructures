package dev.pkj.javadatastructures.inputoutput;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
