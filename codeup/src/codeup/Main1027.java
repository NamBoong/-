package codeup;

import java.util.Scanner;

public class Main1027 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.nextLine();
		
		String arr[] = value1.split(".");
		
		String year = arr[0];
	    String month = (arr[1]);
		String day = (arr[2]);
		
		System.out.printf("%02d-%02d-%04d", day, month, year);
		
		scan.close();
		
	}

}
