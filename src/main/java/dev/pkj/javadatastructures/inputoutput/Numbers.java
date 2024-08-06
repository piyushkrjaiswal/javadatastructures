package dev.pkj.javadatastructures.inputoutput;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i<=n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

    }
}
