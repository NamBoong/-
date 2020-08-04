package codeup;

import java.util.Scanner;

public class Main1025 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.next();
		
		String[] arr = value1.split("");
		
			
			System.out.println("[" + arr[0] + "0000]");
			System.out.println("[" + arr[1] + "000]");
			System.out.println("[" + arr[2] + "00]");
			System.out.println("[" + arr[3] + "0]");
			System.out.println("[" + arr[4] + "]");

		
		scan.close();
		
		
	}
}