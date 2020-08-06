package codeup;

import java.util.Scanner;

public class Main1035 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.nextLine();
		
		Integer answer1 = Integer.valueOf(value1, 16);
		// 16진수인 변수 value1을 먼저 10진수로 바꿔줬다.
		
		String print1 = Integer.toOctalString(answer1);
		// 이번엔 10진수로 바뀐 answer1 변수(구 value1)를 8진수로 바꿔줬다.
		
		System.out.println(print1);
		
		scan.close();
	}

}
