package codeup����6;

import java.util.Scanner;

public class Main1560 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		if(a>b) {
			System.out.println(a-b);
		}
		if(a<b) {
			System.out.println(b-a);
		}
		
		if(a==b) {
			System.out.println(0);
		}
		scan.close();
	}

}
