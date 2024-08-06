package dev.pkj.javadatastructures.string;

import java.util.Scanner;

public class DiverseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int len = st.length();
        int chrctr = 0, numbr = 0;
        char ch;
        for(int i = 0; i < len; i++) {
            ch = st.charAt(i);
            int v = ch;
            if(v>=48 && v<=57) {
                numbr++;
            } else {
                chrctr++;
            }
        }

        System.out.println(Math.max(numbr, chrctr));
    }
}
