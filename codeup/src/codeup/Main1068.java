package codeup;

import java.util.Scanner;

public class Main1068 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		if(value1>=90) {
			System.out.println("A");
		}
		else if(value1>=70) {
			System.out.println("B");
		}
		else if(value1>=40) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		scan.close();
	}

}
