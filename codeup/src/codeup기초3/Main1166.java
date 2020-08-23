package codeup±‚√ 3;

import java.util.Scanner;

public class Main1166 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();

		if (a%400==0 || (a%4==0 && a%100!=0)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		scan.close();
	}

}
