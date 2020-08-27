package codeup기초4_2;

import java.util.Scanner;

public class Main1378 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		
		for(int a=1; a<=n; a++) {
		for(int b=n; a<=b; b--) {
			sum = sum + a;
		}
		}
			System.out.println(sum);
			scan.close();
		//이게 왜 되지??????
	}

}
