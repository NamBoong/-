package codeup±‚√ 4_2;

import java.util.Scanner;

public class Main1356 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.printf("*");
		}
		System.out.printf("\n");
		
		for(int i=0; i<=n-3; i++) {
			System.out.printf("*");
		for(int j=0; j<n-2; j++) {
			System.out.printf(" ");
		}
			System.out.printf("*\n");
		}
		
		for(int i=0; i<n; i++) {
			System.out.printf("*");
		}
		scan.close();
	}

}
