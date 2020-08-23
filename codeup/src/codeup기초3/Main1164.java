package codeup±âÃÊ3;

import java.util.Scanner;

public class Main1164 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(170>=a || 170>=b || 170>=c) {
			System.out.println("CRASH");
		}
		else {
			System.out.println("PASS");
		}
		scan.close();
	}

}
