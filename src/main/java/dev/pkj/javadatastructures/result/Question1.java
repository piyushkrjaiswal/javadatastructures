package dev.pkj.javadatastructures.result;

public class Question1 {
//    Given an array, report the difference between the two statistical indicators Alpha & Beta, where the indicators are defined as follows:
//    Assuming 1-based indexing
//    Alpha: Number of instances a number k appears for exactly k consecutive times in the array.
//    Beta: Number of instances a number k appears for exactly k consecutive times in the array, starting from kth index
//    For example:
//    Given input array [2, 2, 2, 4, 4, 4, 4, 1, 2, 2]
//    & assuming 1-based indexing
//    Alpha = 3, corresponding to 3 instances matching the criteria "k appears exactly k times".
//    Beta = 1, corresponding to 1 instance matching the criteria "k appears exactly k times, starting from k"
//    Final result = |alpha-beta| = |3-1| = 2
//    Your task is to find the absolute difference between the two indicators.
//     Constraints
//      1 ≤ N ≤ 100
//      1 ≤ arr[i] ≤ 15

    public static void main(String[] args) {
        int [] arr = {2, 2, 2, 4, 4, 4, 4, 1, 2, 2};
        int l = arr.length;
        int alpha = 0;
        int beta = 0;
        int alphaCounter = 1;
        int previous = arr[0];
        // calculating alpha
        for(int i=1; i < l; i++) {
            if(previous == arr[i]) {
                alphaCounter += 1;
            } else {
                if(alphaCounter == arr[i-1]) {
                    alpha += 1;
                }
                alphaCounter = 1;
                previous = arr[i];

            }

            if(i==l-1) {
                if(alphaCounter == arr[i-1]) {
                    alpha += 1;
                }
            }
        }
    //{2, 2, 2, 4, 4, 4, 4, 1, 2, 2}
        previous = arr[0];
        int alreadyContains = previous;
        int betaCounter = 0;
        int nonBetaCount = 1;
        int start = 0;
        int end = 0;
        while(end < l) {
            if((start+1) == arr[end]) {
                if(arr[start] == arr[end]) {
                    betaCounter += 1;

                } else {
                    if(betaCounter == arr[end-1]) {
                        beta += 1;
                        betaCounter = 0;
                    }
                    start++;
                    end++;
                }

            }
            if(previous != arr[end]) {
                previous = arr[end];
//                start =
            }
            end++;

        }


        System.out.println(alpha-beta);






    }


}
