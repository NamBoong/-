package codeup±‚√ 4;

import java.util.Scanner;

public class Main1255 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		for(double value1=a; value1<=b;) {
			System.out.format("%.2f ", value1);
			value1 += 0.01;
		}
		scan.close();
	}

}
