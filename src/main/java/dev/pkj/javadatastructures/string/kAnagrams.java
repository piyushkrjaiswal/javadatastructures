package dev.pkj.javadatastructures.string;

import java.util.HashMap;
import java.util.Map;

public class kAnagrams {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "eggkf";
        int k = 1;
        int s1Len = s1.length();
        int s2Len = s2.length();
        Map<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < s1Len; i++) {
            char ch = s1.charAt(i);
            if(mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) + 1);
            } else {
                mp.put(ch, 1);
            }
        }

        for(char ch: mp.keySet()) {
            System.out.println(ch + " " + mp.get(ch));
        }

        System.out.println();

        for(int i = 0; i < s2Len; i++) {
            char ch = s2.charAt(i);
            if(mp.containsKey(ch) && mp.get(ch) > 0) {
                mp.put(ch, mp.get(ch) - 1);
            }
        }

        int count = 0;
        for(char ch: mp.keySet()) {
            System.out.println(ch + " " + mp.get(ch));
            count += mp.get(ch);
        }

        if(count > k) {
            System.out.println(false);;
        }

        System.out.println(true);
    }
}
