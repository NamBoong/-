package codeup±âÃÊ3;

import java.util.Scanner;

public class Main1165 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if((90-a)/5==0 && a>=85) {
			System.out.println(b+1);
		}
		else {
			System.out.format("%.0f", Math.floor(b+((89.99-a)/5)+1));
		}
		scan.close();
	}

}