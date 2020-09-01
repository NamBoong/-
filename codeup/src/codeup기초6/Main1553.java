package codeup±‚√ 6;

import java.util.Scanner;

public class Main1553 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double n = scan.nextDouble();
		
		if(Math.ceil(n)!=0) {
		System.out.format("%.0f", Math.ceil(n));
		}
		
		if(Math.ceil(n)==0) {
		System.out.println(0);
		}
		scan.close();
	}

}
