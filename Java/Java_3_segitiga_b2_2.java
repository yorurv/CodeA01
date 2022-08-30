/*  
    __________
    \        /
     \      /
      \    /
       \  /
        \/

    __________   Baris = 5
    \++++++++/   (-) = 0     (+) = 8
    -\++++++/    (-) = 1     (+) = 6
    --\++++/     (-) = 2     (+) = 4
    ---\++/      (-) = 3     (+) = 2
    ----\/       (-) = 4     (+) = 0
*/

import java.util.Scanner;

class Java_4_segitiga_b22 {
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
        int j = (tinggi * 2) - 2;

        System.out.println( repeat("_", (tinggi*2)) );

        for(int i=0; i < tinggi; i++) {
            System.out.print( repeat(" ", i) );
            System.out.print( "\\" );
            System.out.print( repeat(" ", j) );
            System.out.println( "/" );
            j -= 2;
        }
    }
}
