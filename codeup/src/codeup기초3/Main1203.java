package codeup기초3;

import java.util.Scanner;

public class Main1203 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a<=10) {
			System.out.println("정상");
		}
		if(a<=20 && a>10) {
			System.out.println("과체중");
		}
		if(a>20) {
			System.out.println("비만");
		}
		scan.close();
		}

}
