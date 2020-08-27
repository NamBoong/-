package codeup±‚√ 4_2;

import java.util.Scanner;

public class Main1358 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int j = 0;
		
		for(int i=1; i<=n/2+1; i++) {
		for(int k=(n-n/2)-i; k>0; k--) {
			System.out.printf(" ");
		}
		for(j=0; j<i*2-1; j++) {
			System.out.printf("*");
		}
			System.out.printf("\n");
		}
		scan.close();
	}
}
