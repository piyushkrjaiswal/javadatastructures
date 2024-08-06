package dev.pkj.javadatastructures.general;

public class NPlayersMove {
    public static void main(String[] args) {
        String s = "<<^<!>>";
        int n = s.length();
        boolean[] NotOccupiedPlace = new boolean[n];
        int target = -1;
        int successfulMove = 0;
        for(int i = 0; i < n; i++) {
            char move = s.charAt(i);
            switch(move) {
                case '<':
                    target = i - 1;
                    break;

                case '>':
                    target = i + 1;
                    break;
            }

            if(target < 0 || target >= n) {
                successfulMove++;
                NotOccupiedPlace[i] = true;
            } else if(target >= 0 && target < n) {
                if(NotOccupiedPlace[target] == true) {
                    successfulMove++;
                    NotOccupiedPlace[i] = true;
                }
            }

        }

        System.out.println(successfulMove);
    }
}
