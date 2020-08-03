package codeup;

import java.util.Scanner;

public class Main1024 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String value1 = scan.nextLine();
		
		String[] arr = value1.split("");
		
		for(int i=0; i<arr.length; i++) {
			// i++ 먼저 배열 쓰고 i에 1증가
			// i-- 먼저 배열 쓰고 i에 1감소
			// --i 1부터 감소하고 -1+i한거 사용
			// ++i 1부터 증가하고 1+i한거 사용
			
			System.out.println(arr[i]);
			
			scan.close();
			
		}
		
		
	}

}
