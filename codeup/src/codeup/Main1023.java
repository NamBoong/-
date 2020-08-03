package codeup;

import java.util.Scanner;

public class Main1023 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.nextLine();
		
     	String[] arr = value1.split("\\.");
		
		if( arr.length > 1) {
			// 0으로 시작하지않는다고했으니 무조건 1보다는 크다.
			
			System.out.println(arr[0]);
			System.out.println(arr[1]);

			
		}
			
		
	}

}
