package codeup±âÃÊ3;

import java.util.Scanner;

public class Main1202 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();

		if(a>=90) {
			System.out.println("A");
		}
		if(90>a && a>=80) {
			System.out.println("B");
		}
		if(80>a && a>=70) {
			System.out.println("C");
		}
		if(70>a && a>=60) {
			System.out.println("D");
		}
		if(60>a) {
			System.out.println("F");
		}
		
		scan.close();
	}

}
