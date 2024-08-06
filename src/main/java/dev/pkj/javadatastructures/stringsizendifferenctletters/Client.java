package dev.pkj.javadatastructures.stringsizendifferenctletters;

import java.util.Collections;

public class Client {
/*   Write a function solution that given an integer N returns a string of length N containing
as many different lower case letters ('a'-'z') as possible, in which each letter occurs as an equal
number of times. Example Given N=3, the function may return "fig", "pea", "nut",etc.Each of these
strings contains three different letters with the same number of occurrences. Example 2.Given N=5,
the function may return "mango","grape", "melon" 3.Given N=30,the function may return "aabbcc...oo"
(each letter from 'a' to 'o' occurs twice) the string contains 15 different letters. write an efficient
algorithm for the following assumptions: N is an integer within the range [1..200,000]
*/
    public static void main(String[] args) {
        int n = 50;

        System.out.println(generateNSizeString(n));

        n = 201;
        System.out.println(generateNSizeString(n));

        n = 1000;
        System.out.println(generateNSizeString(n));
    }

    public static String generateNSizeString(int n) {
        int cnt = Integer.MAX_VALUE;
        String ch = "abcdefghijklmnopqrstuvwxyz";
        boolean isEven;
        int size;
        StringBuilder sb = new StringBuilder();
        if(n <= 26) {
            for(int i = 0; i < n; i++) {
                sb.append(ch.charAt(i));
            }

            return sb.toString();
        }

        if(n%2 == 0) {
            isEven = true;
            size = n;
        } else {
            isEven = false;
            size = n-1;

        }

        for(int i = 2; i < 26; i++) {
            if(size%i == 0) {
                cnt = Math.min(cnt, size/i);
            }

        }


        int i = 0;
        while(sb.length() < size) {
//            for(int j = 0; j < cnt; j++) {
            String a = String.valueOf(ch.charAt(i));
            String s = new String(new char[cnt]).replace("\0",a);
            sb.append(s);
//            }
            i++;
        }
        if(!isEven) {
            sb.append(ch.charAt(0));
        }

        return sb.toString();

    }
}
