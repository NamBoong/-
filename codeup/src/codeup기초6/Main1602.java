package codeup±‚√ 6;

import java.util.Scanner;

public class Main1602 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double n = scan.nextDouble();
		
		if(n-Math.floor(n)==0) {
		System.out.println((int) Math.abs(n));
		}
		if(n-Math.floor(n)!=0) {
		System.out.println(Math.abs(n));
		}
		
		scan.close();
	}

}
