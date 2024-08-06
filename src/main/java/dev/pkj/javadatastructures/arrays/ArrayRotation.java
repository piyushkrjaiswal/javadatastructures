package dev.pkj.javadatastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        int [] arr = new int[]{2, 3, 4, 5, 6, 7};
        int len = arr.length;
        Scanner sc = new Scanner(System.in);
        int rotationVal = sc.nextInt();
        int rem = rotationVal % len;
        int [] c = new int[len];
        int cnt = 0;
        if(rem != 0) {
            for(int i = len - rem; i < len; i++) {
                c[cnt++] = arr[i];
            }
        }

        for(int i = 0; i < len - rem; i++) {
            c[cnt++] = arr[i];
        }

        System.out.println(Arrays.toString(c));


    }

}
