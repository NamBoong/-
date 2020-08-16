package codeup;

import java.util.Scanner;

public class Main1086 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double w = scan.nextInt();
		double h = scan.nextInt();
		double b = scan.nextInt();
		
		double a = (w*h*b)/(8*Math.pow(1024, 2));
		
		System.out.printf("%.2f MB", a);

		scan.close();
	}

}
