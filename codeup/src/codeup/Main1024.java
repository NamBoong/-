package codeup;

import java.util.Scanner;

public class Main1024 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String value1 = scan.nextLine();
		
		String[] arr = value1.split("");
		
		for(int i=0; i<arr.length; i++) {
			// i++ ���� �迭 ���� i�� 1����
			// i-- ���� �迭 ���� i�� 1����
			// --i 1���� �����ϰ� -1+i�Ѱ� ���
			// ++i 1���� �����ϰ� 1+i�Ѱ� ���
			
			System.out.println(arr[i]);
			
			scan.close();
			
		}
		
		
	}

}
