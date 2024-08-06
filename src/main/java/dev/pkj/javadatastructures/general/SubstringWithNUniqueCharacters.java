package dev.pkj.javadatastructures.general;

import java.util.Arrays;

public class SubstringWithNUniqueCharacters {
    public static int partitionString(String s) {
        int [] last = new int[26];
        Arrays.fill(last, -1);

        int n = s.length();
        int ans = 1;
        int start = 0;
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if(last[index] >= start) {
                ans++;
                start = i;
            }
            last[index] = i;
        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(partitionString(s));
    }
}
