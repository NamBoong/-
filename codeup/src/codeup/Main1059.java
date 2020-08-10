package codeup;

import java.util.Scanner;

public class Main1059 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		int value2 = ~value1;
		// ~을 쓰면 2진수의 0이 1로 1이 0으로 바뀌고 부호는 반대로 된다.
		
		System.out.println(value2);
		
		scan.close();
	}

}
