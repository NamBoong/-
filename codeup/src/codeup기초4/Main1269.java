package codeup±‚√ 4;

import java.util.Scanner;

public class Main1269 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int n = scan.nextInt();
		
		for(int i=2; i<=n; i++) {
			a = a * b + c;
		}
		System.out.println(a);
		scan.close();
	}

}
