package codeup;

import java.util.Scanner;

public class Main1014 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String value1 = scan.next();
		String value2 = scan.next();
		// 문자 1개 나왔을때를 기억하자. 그때와 똑같다.
		
		scan.close();

		System.out.println(value2);
		System.out.println(value1);
		// 서로의 순서를 바꿔주라고했으니 2를 먼저, 그 뒤에 1을 입력하자.
				
		
	}

}
