package codeup±‚√ 5_4;

import java.util.Scanner;

public class Main1172 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(Math.min(c, Math.min(a, b)) + " " + (a+b+c- Math.min(c, Math.min(a, b)) - Math.max(c, Math.max(a, b)))+ " "+ Math.max(c, Math.max(a, b)));
		
		scan.close();
	}

}
