package codeup;

import java.util.Scanner;

public class Main1019 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		String value1 = scan.next();
		
		String[] arr = value1.split("\\.");
		
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		System.out.printf("%04d.%02d.%02d",year,month,day);
		
		scan.close();
		
	}

}
