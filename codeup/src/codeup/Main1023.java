package codeup;

import java.util.Scanner;

public class Main1023 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.nextLine();
		
     	String[] arr = value1.split("\\.");
		
		if( arr.length > 1) {
			// 0���� ���������ʴ´ٰ������� ������ 1���ٴ� ũ��.
			
			System.out.println(arr[0]);
			System.out.println(arr[1]);

			
		}
			
		
	}

}
