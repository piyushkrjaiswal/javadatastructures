package dev.pkj.javadatastructures.tripletswithsum0;

import java.util.*;

public class tripletsSumZero {
//      Input: arr[] = {0, -1, 2, -3, 1}
//      Output: (0 -1 1), (2 -3 1)


        public static List<List<Integer>> findTriplet(int [] arr) {
                int n = arr.length;
                int res;
                List<List<Integer>> ls = new ArrayList<>();
                HashSet<List<Integer>> hs = new HashSet<>();
                Arrays.sort(arr);
                for(int i = 0; i < n-1; i++) {
                        int st = arr[i+1];
                        int end = arr[n-1];
                        int x = arr[i];
                        while(st < end) {
                                if ((x + st + end) == 0) {
                                        List<Integer> subLs = new ArrayList<>();
                                        subLs.add(arr[i]);
                                        subLs.add(st);
                                        subLs.add(end);
                                        if(!hs.contains(subLs)) {
                                                ls.add(subLs);
                                                hs.add(subLs);
                                        }
                                        st++;
                                        end--;
                                } else if((x + arr[i + 1] + arr[i + 2]) < 0) {
                                        st++;
                                } else {
                                        end--;
                                }
                        }
                }

                return ls;


        }

        public static void main(String[] args) {
                int [] arr = {0, -1, 2, -3, 1};
                List<List<Integer>> triplets = findTriplet(arr);
                Iterator<List<Integer>> itr = triplets.iterator();
                while(itr.hasNext()) {
                        System.out.println(itr.next());
                }

        }
}
