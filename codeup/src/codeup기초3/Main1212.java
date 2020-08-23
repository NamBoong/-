package codeup±âÃÊ3;

import java.util.Scanner;

public class Main1212 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int x = Math.max(Math.max(a, b), Math.max(b, c));
		
		if((a+b+c)-x>x) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		scan.close();
	}

}
