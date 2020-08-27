package codeup±‚√ 4_2;

import java.util.Scanner;

public class Main1361 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
		for(int k=1; k-1<i; k++) {
			System.out.printf(" ");
		}
		for(int j=0; j<2; j++) {
			System.out.printf("*");
		}
			System.out.printf("\n");
		}
		scan.close();
	}

}
