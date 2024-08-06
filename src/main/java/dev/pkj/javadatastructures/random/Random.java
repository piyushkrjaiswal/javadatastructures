package dev.pkj.javadatastructures.random;

public class Random {
    public static void main(String[] args) {
        int [] arr = { -3, -2, -1, 0, 1, 2, 3};
        int l = arr.length;
        int x;
        int y;
        int z;
        for(int i = 0; i < l; i++ ) {
            x = arr[i];
            y = i;
            z = l - 1;
            while (y < z) {
                int res = x + arr[y] + arr[z];
                if ( res == 0) {
                    System.out.println(x + " " + arr[y] + " " + arr[z]);
                    y++;
                } else if (res < 0) {
                    y++;
                } else {
                    z--;
                }
            }
        }
    }




}
