package dev.pkj.javadatastructures.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                int a = sc.nextInt();
                al.add(a);
            }
            arr.add(al);
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i==j) {
                    sum = sum + arr.get(i).get(j);
                }
            }
        }

        System.out.println(sum);

    }
}
