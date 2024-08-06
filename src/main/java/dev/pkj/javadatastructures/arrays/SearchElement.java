package dev.pkj.javadatastructures.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int p;
        for(int i = 0; i<t; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            int n = sc.nextInt();
            for(int j = 0; j < n; j++) {
                p = sc.nextInt();
                a.add(p);
            }
            int b = sc.nextInt();
            if(a.isEmpty()) {
                System.out.println(0);
            } else if(a.contains(b)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
