package codeup±‚√ 6;

import java.util.Scanner;

public class Main1550 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		
		System.out.format("%.0f", Math.floor(Math.sqrt(n)));
		
		scan.close();
	}

}
