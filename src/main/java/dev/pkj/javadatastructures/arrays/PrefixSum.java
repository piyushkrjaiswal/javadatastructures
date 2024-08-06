package dev.pkj.javadatastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            arr[i] = s;
        }
        System.out.println(Arrays.toString(solve(arr)));

    }

    public static int[] solve(int[] A) {
        int prefix = A[0];
        int [] psum = new int[A.length];
        psum[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            psum[i] = psum[i-1] + A[i];
        }

        return psum;
    }
}
