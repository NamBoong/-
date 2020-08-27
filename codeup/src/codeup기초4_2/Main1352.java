package codeup±‚√ 4_2;

import java.util.Scanner;

public class Main1352 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i=1; i<=a; i++) {
		for(int j=1; j<=a; j++) {
			System.out.printf("*");
		}
			System.out.printf("\n");
		}
		scan.close();
	}

}
