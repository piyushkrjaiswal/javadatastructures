package dev.pkj.javadatastructures.general;

public class MinimumDeletionToMakeStringBalanced {
    public static void main(String[] args) {
        String s = "aababbab";
        int l = s.length();
        System.out.println(minDeletion(s, l));
    }

    public static int minDeletion(String s, int l) {
        int cntB = 0;
        int cntA = 0;
        for(int i = 0; i < l; i++) {
            if(s.charAt(i) == 'a') {
                if(cntB > 0) {
                    cntB--;
                    cntA++;
                }
            } else {
                cntB++;
            }
        }

        return cntA;

    }
}
