package dev.pkj.javadatastructures.result;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,2,1,5,1, 1, 1, 1, 1};
        int maxm = 0;
        int total = 5;
        int l = arr.length;
        int [] pf = new int[l];
        pf[0] = arr[0];
        for(int i = 1; i < l; i++) {
            pf[i] = pf[i-1] + arr[i];
        }

        for(int i = l-1; i >= 0; i--) {
            for(int j = l-2; j>=0; j--) {
                if((pf[i] - pf[j]) == total) {
                    maxm = Math.max(maxm, (i-j));
                }
            }
        }

        //sliding win

        System.out.println(maxm);

    }
}
