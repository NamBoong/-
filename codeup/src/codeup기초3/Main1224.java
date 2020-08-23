package codeup±âÃÊ3;

import java.util.Scanner;

public class Main1224 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextInt();
		double b = scan.nextInt();
		double c = scan.nextInt();
		double d = scan.nextInt();
		
		while(true) {
			if(a/b > c/d) {
				System.out.println(">");
				break;
			}
			if(a/b == c/d) {
				System.out.println("=");
				break;
			}
			if(a/c < c/d) {
				System.out.println("<");
				break;
			}
		}
		scan.close();
	}
}
