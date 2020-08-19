package codeup±âÃÊ2;

import java.util.Scanner;

public class Main1180 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int x = ((a%10)*10 + (a/10))*2;
		
		if(x>=100) {
			System.out.println(x-100);
			if((x-100)<=50) {
				System.out.println("GOOD");
			}
			else {
				System.out.println("OH MY GOD");
			}
		}
		else {
			System.out.println(x);
			if((x-100)<=50) {
				System.out.println("GOOD");
			}
			else {
				System.out.println("OH MY GOD");
			}
		}
		scan.close();
	}

}
