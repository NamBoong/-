package codeup±âÃÊ6;

import java.util.Scanner;

public class Main1548 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(100>=n && n>=90) {
			System.out.println("A");
		}
		if(90>n && n>=80) {
			System.out.println("B");
		}
		if(80>n && n>=70) {
			System.out.println("C");
		}
		if(70>n && n>=60) {
			System.out.println("D");
		}
		if(60>n) {
			System.out.println("F");
		}
	}

}
