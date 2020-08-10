package codeup;

import java.util.Scanner;

public class Main1067 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		if(value1>0) {
			System.out.println("plus");
		}
		else {
			System.out.println("minus");
		}
		if(value1%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		scan.close();
	}

}
