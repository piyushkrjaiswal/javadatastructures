package dev.pkj.javadatastructures.minimumsubstring;

import java.util.HashSet;
import java.util.Set;

public class Client {

    public static int findMinNumberOfSubstringWithUniqueCharacter(String s) {
        int l = s.length();
        int ans = 1;
        Set<Character> hs = new HashSet<>();
        for(int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if(hs.contains(ch)) {
                ans++;
                hs.clear();
            }
            hs.add(ch);

        }

        return ans;

    }

    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(findMinNumberOfSubstringWithUniqueCharacter(s));

        String s1 = "ssssss";
        System.out.println(findMinNumberOfSubstringWithUniqueCharacter(s1));


    }
}
