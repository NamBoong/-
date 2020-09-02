package codeup±‚√ 6;

import java.util.Scanner;

public class Main1563 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println((a+b+c)-Math.max(c, Math.max(a, b))-Math.min(c, Math.min(a, b)));
		scan.close();
	}

}
