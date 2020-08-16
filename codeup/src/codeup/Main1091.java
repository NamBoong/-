package codeup;

import java.util.Scanner;

public class Main1091 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		long m = scan.nextLong();
		long d = scan.nextLong();
		long n = scan.nextLong();
		
		for(int i=1; i<n; i++) {
			
			a = (a*m)+d;
		}
		System.out.println(a);

		scan.close();
	}

}
