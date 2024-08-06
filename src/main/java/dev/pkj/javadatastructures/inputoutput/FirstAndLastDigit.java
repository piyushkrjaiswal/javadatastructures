package dev.pkj.javadatastructures.inputoutput;

import java.util.Scanner;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0) {
            int first = -1, last = -1;
            int t = sc.nextInt();
            int rem;
            while(t != 0) {
                rem = t % 10;
                t = t/10;

                if(last == -1) {
                    last = rem;
                }
                if(t == 0) {
                    first = rem;
                }
            }
            System.out.println(first + " " + last);
            n--;
        }
    }
}
