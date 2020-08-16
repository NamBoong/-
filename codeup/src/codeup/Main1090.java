package codeup;

import java.util.Scanner;

public class Main1090 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int r = scan.nextInt();
		int n = scan.nextInt();
		
		System.out.format("%.0f", a*Math.pow(r, (n-1)));
		scan.close();
	}

}
