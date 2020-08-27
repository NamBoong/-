package codeup±‚√ 4_2;

import java.util.Scanner;

public class Main1368 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		char c = scan.next().charAt(0);
		
		for(int i=0; i<a; i++) {
		if(c==76) {
			for(int l=0; l<i; l++) {
				System.out.printf(" ");
			}
		}
		if(c==82) {
			for(int r=a; r-i-1>0; r--) {
				System.out.printf(" ");
			}
		}
		for(int j=0; j<b; j++) {
			System.out.printf("*");
		}
			System.out.printf("\n");
		}
		scan.close();
	}

}
