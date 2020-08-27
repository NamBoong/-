package codeup±‚√ 4_2;

import java.util.Scanner;

public class Main1370 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int r = scan.nextInt();
		
		for(int round=0; round<r; round++) {
		for(int i=0; i<h; i++) {
		for(int j=h; h-j<i; j--) {
			System.out.printf(" ");
		}
			System.out.printf("*");
			System.out.printf("\n");
		}
		for(int i=1; i<h; i++) {
		for(int k=1; h-k>i; k++) {
			System.out.printf(" ");
		}
			System.out.printf("*");
			System.out.printf("\n");
		}
		}
		scan.close();
	}

}
