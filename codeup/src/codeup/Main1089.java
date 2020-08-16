package codeup;

import java.util.Scanner;

public class Main1089 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		
		System.out.println(a+(d*(n-1)));
		//등차수열 공식을 이용하면 된다.
		
		scan.close();
	}

}
