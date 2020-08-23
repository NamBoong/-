package codeup±‚√ 3;

import java.util.Scanner;

public class Main1172 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int x = Math.min(Math.min(a, b), Math.min(b, c));
		int y = Math.max(Math.max(a, b), Math.max(b, c));
		System.out.println(x+" "+((a+b+c)-x-y)+" "+y);
			
		scan.close();
	}

}
