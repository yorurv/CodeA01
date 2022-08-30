/*
        /\
       /  \
      /    \
     /      \
    /________\

                Baris = 5
    ----/\      (-) = 4     (+) = 0
    ---/++\     (-) = 3     (+) = 2
    --/++++\    (-) = 2     (+) = 4
    -/++++++\   (-) = 1     (+) = 6
    /________\  (-) = 0     (_) = 8
*/

import java.util.Scanner;

class Java_3_segitiga_b1 {
    static String repeat(String str, int n) {
        String new_str = "";
        for(int i=0; i<n; i++) {
            new_str += str;
        }
        return new_str;
    }
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Segitiga : ");
        
        int tinggi = scn.nextInt();
        int j = 0;

        for(int i=tinggi-1; i >= 0; i--) {
            System.out.print( repeat(" ", i) );
            System.out.print( "/" );

            if(i==0) {
                System.out.print( repeat("_", j) );
            }
            else {
                System.out.print( repeat(" ", j) );
            }

            System.out.println( "\\" );
            j += 2;
        }
    }
}
