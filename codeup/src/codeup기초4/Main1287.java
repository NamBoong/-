package codeup±‚√ 4;

import java.util.Scanner;

public class Main1287 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = 1;
		int answer = 0;
		
		for(a=1; a<=9; a++) {
			answer = n*a;
			for(int b=1; b<=answer; b++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		scan.close();
	}
}
