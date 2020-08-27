package codeup±‚√ 4_2;

import java.util.Scanner;

public class Main1357 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
		for(int j=0; j<=i; j++) {
			System.out.printf("*");
		}
			System.out.printf("\n");
		}
		
		for(int i=0; i<n; i++) {
		for(int j=n; i<j-1; j--) {
			System.out.printf("*");
		}
			System.out.printf("\n");
		}
		scan.close();
	}

}
