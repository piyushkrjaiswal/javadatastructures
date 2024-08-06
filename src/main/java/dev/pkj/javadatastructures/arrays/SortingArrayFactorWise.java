package dev.pkj.javadatastructures.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingArrayFactorWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0; i < n; i++) {
            int a = sc.nextInt();
            A[i] = a;
        }
        Integer [] arr = new Integer[n];
        for(int i = 0; i<n; i++) {
            arr[i] = A[i];
        }

        Arrays.sort(arr, new Comparator<Integer> () {
                @Override
                public int compare(Integer a, Integer b) {
                    int fa = countFactor(a);
                    int fb = countFactor(b);
                    int state = 0;
                    if (fa == fb) {
                        state = a - b;
                    } else {
                        state = fa - fb;
                    }
                    return state;
                }
        });

        for(int i = 0; i<n; i++) {
            A[i] = arr[i];
        }

        System.out.println(Arrays.toString(A));

    }

    public static int countFactor(int a) {
        int cnt = 0;
        for(int i = 1; i*i <= a; i++) {
            if(a % i == 0) {
                if ((i * i) == a) {
                    cnt++;
                } else {
                    cnt += 2;
                }
            }
        }

        return cnt;
    }
}
