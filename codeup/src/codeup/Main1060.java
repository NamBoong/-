package codeup;

import java.util.Scanner;

public class Main1060 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		System.out.println(value1 & value2);
		// 정수와 정수 사이에 &를 붙이면 2진법 코드 중 서로 일치하는 1부분만 출력된다.
		
		scan.close();
	}

}
