package codeup����6;

import java.util.Scanner;

public class Main1561 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.println(a);
		}
		
		if(a<b) {
			System.out.println(b);
		}
		
		if(a==b) {
			System.out.println(0);
		}
		scan.close();
	}

}
