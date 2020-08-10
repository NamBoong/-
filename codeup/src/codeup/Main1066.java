package codeup;

import java.util.Scanner;

public class Main1066 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		int value3 = scan.nextInt();
		
		if(value1%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		if(value2%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		if(value3%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		scan.close();
	}

}
