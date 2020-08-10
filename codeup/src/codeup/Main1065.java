package codeup;

import java.util.Scanner;

public class Main1065 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		int value3 = scan.nextInt();
		
		if(value1%2==0) {
			System.out.println(value1);
		}
		if(value2%2==0) {
			System.out.println(value2);
		}
		if(value3%2==0) {
			System.out.println(value3);
		}
		scan.close();
	}

}
