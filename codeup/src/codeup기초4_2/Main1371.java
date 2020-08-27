package codeup기초4_2;

import java.util.Scanner;

public class Main1371 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
		for(int j=n; i+1<j; j--) {
			System.out.printf(" ");
		}
			System.out.printf("*");
		//왼쪽 위
		
		for(int a=n; n-a<i; a--) {
			System.out.printf("  ");
		}
			System.out.printf("*");
			
			System.out.printf("\n");
		}	
		//오른쪽 위
		
		for(int i=0; i<n; i++) {
		for(int a=n; n-a<i; a--) {
			System.out.printf(" ");
		}
			System.out.printf("*");
		//왼쪽 아래
			
		for(int k=1; n-k>i; k++) {
			System.out.printf("  ");
		}
			System.out.printf("*");
			System.out.printf("\n");
		}
		//오른쪽 아래
		
		scan.close();
	}

}
