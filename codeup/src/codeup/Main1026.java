package codeup;

import java.util.Scanner;

public class Main1026 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.nextLine();
		
		String[] arr = value1.split(":");
		
		int min = Integer.valueOf(arr[1]);
		
		System.out.println(min);
		
		scan.close();
	}

}
