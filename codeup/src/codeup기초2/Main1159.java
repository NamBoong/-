package codeup기초2;

import java.util.Scanner;

public class Main1159 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Double a = scan.nextDouble();
		
		if((50<=a && a<=70) || (a%6==0)) {
			// 소숫점까지 안나눠떨어져도 된다. 잉...?
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
		scan.close();
	}

}
