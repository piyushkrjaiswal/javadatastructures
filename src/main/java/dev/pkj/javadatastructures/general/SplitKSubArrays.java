package dev.pkj.javadatastructures.general;

import java.util.Collections;
import java.util.Vector;

public class SplitKSubArrays {
    public static void main(String[] args) {
        int [] arr = {4, 8, 15, 16, 23, 42};
        int l = arr.length;
        int k = 3;
        System.out.println(find(arr, l, k));
    }

    private static int find(int [] arr, int l, int n) {
        Vector<Integer> v = new Vector<Integer>();
        for(int i = 1; i < l; ++i)  {
            v.add(arr[i-1] - arr[i]);
        }

        Collections.sort(v);

        int res = arr[l-1] - arr[0];
        for(int i = 0; i < n-1; i++) {
            res += v.get(i);

        }

        return res;
    }
}
