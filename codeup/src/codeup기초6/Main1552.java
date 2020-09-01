package codeup±‚√ 6;

import java.util.Scanner;

public class Main1552 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		
		System.out.format("%.14f", a-Math.floor(a));
		
		scan.close();
	}

}
