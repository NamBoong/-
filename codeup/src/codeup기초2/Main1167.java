package codeup±‚√ 2;

import java.util.Scanner;

public class Main1167 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int x = Math.min(a, Math.min(b, c));
		int y = Math.max(a, Math.max(b, c));
		
		System.out.println((a+b+c)-x-y);
		
		scan.close();
	}

}
