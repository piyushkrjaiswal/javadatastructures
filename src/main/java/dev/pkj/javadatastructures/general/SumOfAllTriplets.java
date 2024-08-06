package dev.pkj.javadatastructures.general;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAllTriplets {
    public static void main(String[] args) {
        int [] arr = {0, -1,  2, -3, 1};
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n-1; i++) {
            int x = arr[i];
            int l = arr[i+1];
            int r = arr[n-1];
            while(l < r) {
                if ((x + l + r) == 0) {
                    ArrayList<Integer> sAl = new ArrayList<>();
                    sAl.add(x);
                    sAl.add(l);
                    sAl.add(r);
                    al.add(sAl);
                    l++;
                    r--;

                } else if (x + l + r < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        for(int i = 0; i < al.size(); i++) {

                System.out.println("( " + al.get(i).get(0) + " " + al.get(i).get(1) + " " + al.get(i).get(2) +  " )");

        }
    }
}
