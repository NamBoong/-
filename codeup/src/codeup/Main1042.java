package codeup;

import java.util.Scanner;

public class Main1042 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double value1 = scan.nextDouble();
		double value2 = scan.nextDouble();
		
		System.out.printf("%.0f", Math.floor(value1/value2));
		// �����Լ� floor�� �Է�������.
		
		scan.close();
		
	}

}
