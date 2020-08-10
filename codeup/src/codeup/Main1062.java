package codeup;

import java.util.Scanner;

public class Main1062 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		System.out.println(value1 ^ value2);
		
		scan.close();
	}

}
