package dev.pkj.javadatastructures.arrays;

import java.util.Scanner;

public class WavePrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] p = new int[n][n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                p[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            if(i%2 == 0) {
                for(int j = 0; j < n; j++) {
                    System.out.print(p[j][i] + " ");
                }
            } else {
                for(int j = n-1; j >= 0; j--) {
                    System.out.print(p[j][i] + " ");
                }
            }
        }
    }

}
