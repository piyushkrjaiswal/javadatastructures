package dev.pkj.javadatastructures.arrays;

import java.util.Scanner;

public class SpecialSubsequenceAG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int gCount = 0;
        int aCount = 0;
        char ch;
        for(int i = n-1; i>=0; i--) {
            ch = s.charAt(i);
            if(ch == 'G') {
                gCount = gCount + 1;
            }

            if(ch == 'A') {
                aCount = aCount + gCount;
                aCount = aCount % 1000000007;
            }
        }

        System.out.println(aCount);

    }



}
