package dev.pkj.javadatastructures.arrays;

import java.util.Scanner;

public class InsertANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();
        int num = sc.nextInt();

        int current = 0, prev = 0;
        for(int i = 0; i < n+1; i++) {
            if(i == pos-1) {
                prev = arr[i];
                arr[i] = num;
            }

            if(i > (pos - 1)) {
                current = arr[i];
                arr[i] = prev;
                prev = current;
            }
        }

        for(int i = 0; i < n+1; i++) {
            System.out.print(arr[i] + " ");
        }

    }



}
