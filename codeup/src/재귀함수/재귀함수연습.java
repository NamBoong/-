package Àç±ÍÇÔ¼ö;

import java.util.Scanner;

public class Àç±ÍÇÔ¼ö¿¬½À {

	public static int factorial(int number) {
		int sum =1;
		for(int i=2; i<=number; i++) {
			sum *= i;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println("ÆÑÅä¸®¾óÀº?" + factorial(n));
		
		scan.close();
	}

}
