package codeup;

import java.util.Scanner;

public class Main1044 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long value1 = scan.nextLong();
		//긴 숫자도 받을 수 있게 long으로 변수타입을 지정해준다.
		
		System.out.println(++value1);
		
		scan.close();
	}

}
