package codeup±‚√ 4_2;

import java.util.Scanner;

public class Main1355 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		

		for(int i=0; i<n; i++) {
		for(int k=0; k<i; k++) {
				System.out.printf(" ");
			}
		for(int j=n; j>0+i; j--) {
			System.out.printf("*");
		}
			System.out.printf("\n");
		}
		scan.close();
	}

}
