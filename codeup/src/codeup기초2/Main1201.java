package codeup기초2;

import java.util.Scanner;

public class Main1201 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a>0) {
			System.out.println("양수");
		}
		if(a==0) {
			System.out.println("0");
		}
		if(a<0) {
			System.out.println("음수");
		}
		scan.close();
	}

}
