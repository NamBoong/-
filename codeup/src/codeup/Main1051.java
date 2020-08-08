package codeup;

import java.util.Scanner;

public class Main1051 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		if(value2>=value1) {
			System.out.println(1);
		}
		if(value2<value1) {
		System.out.println(0);
		}
		scan.close();
	}

}
