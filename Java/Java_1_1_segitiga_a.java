/*
	*        |\     
	**       | \
	***      |  \
	****     |   \
	*****    |____\  
*/

import java.util.Scanner;

class Java_1_1_segitiga_a {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Masukkan Tinggi Segitiga : ");
		int tinggi = scn.nextInt();

		for(int i=0; i < tinggi; i++) {
			System.out.print("|");
			for(int j=0; j < i; j++) {
				if(i == tinggi-1) {
					System.out.print("_");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("\\");
		}
	}
}
