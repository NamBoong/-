package codeup;

import java.util.Scanner;

public class Main1056 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		if(value1==1 & value2==1 && value1==0 & value2==0) {
			System.out.println(0);
			// 현재 나눠서 작성해도 1과 0 결과값이 같이 나오는 현상이 발생중이다.
		}
		else {
			System.out.println(1);
		}
		scan.close();
	}

}
