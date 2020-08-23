package codeup±‚√ 3;

import java.util.Scanner;

public class Main1230 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		while(true) {
			if(170<a && 170<b && 170<c) {
				System.out.println("PASS");
				break;
			}
			if(170>=a) {
				System.out.println("CRASH "+a);
				break;
			}
			if(170>=b) {
				System.out.println("CRASH "+b);
				break;
			}
			if(170>=c) {
				System.out.println("CRASH "+c);
				break;
			}
		}
		scan.close();
	}

}
