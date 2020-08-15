package codeup;

import java.util.Scanner;

public class Main1085 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextInt();
		double b = scan.nextInt();
		double c = scan.nextInt();
		double d = scan.nextInt();	
		
		double i = (a*b*c*d)/(1024*1024*8);
		
		System.out.println(String.format("%.1f", i) + " MB");
		scan.close();
		}
	}