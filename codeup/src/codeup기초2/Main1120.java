package codeup±‚√ 2;

import java.util.Scanner;

public class Main1120 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		System.out.printf("%.2f", (a+b+c)/3);
		scan.close();
	}

}
