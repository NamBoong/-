package codeup±‚√ 2;

import java.util.Scanner;

public class Main1150 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(Math.min(Math.min(a, b),Math.min(b, c)));
		scan.close();
	}

}
