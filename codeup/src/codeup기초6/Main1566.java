package codeup기초6;

import java.util.Scanner;

public class Main1566 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		System.out.println(Math.pow(a, b));
		scan.close();
	}

}
// 자바로는 풀 수 없는 문제라고 한다. 제곱은 되지만 뒤에 숫자에서 차이가 나는듯 하다.