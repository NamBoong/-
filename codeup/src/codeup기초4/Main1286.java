package codeup±‚√ 4;

import java.util.Scanner;

public class Main1286 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		
		System.out.println(Math.max(Math.max(Math.max(a, b), Math.max(c, d)),e));
		System.out.println(Math.min(Math.min(Math.min(a, b), Math.min(c, d)),e));
		scan.close();
	}

}
