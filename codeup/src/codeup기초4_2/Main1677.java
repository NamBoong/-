package codeup±‚√ 4_2;

import java.util.Scanner;

public class Main1677 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		System.out.printf("+");
		for(int a=0; a<n-2; a++) {
			System.out.printf("-");
		}
		System.out.printf("+\n");
		//√µ¿Â
		
		for(int b=0; b<m-2; b++) {
			System.out.printf("|");			
		for(int c=0; c<n-2; c++) {
			System.out.printf(" ");
		}
			System.out.printf("|\n");		
		}
		//∏ˆ≈Î
		
		System.out.printf("+");
		for(int a=0; a<n-2; a++) {
			System.out.printf("-");
		}
		System.out.printf("+\n");
		//πÿ∆«
		scan.close();
	}

}
