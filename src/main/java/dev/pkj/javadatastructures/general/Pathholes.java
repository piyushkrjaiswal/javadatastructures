package dev.pkj.javadatastructures.general;

public class Pathholes {
    public static int solution(String s) {
        int patches = 0;
        int i = 0;
        int n = s.length();
        while(i <= n) {
            if(s.charAt(i) == 'X') {
                patches++;
                i += 3;
            } else {
                i++;
            }
        }

        return patches;

    }

    public static void main(String[] args) {
        String s = "x. Xxxxx. X";
        System.out.println(solution(s));
    }
}
