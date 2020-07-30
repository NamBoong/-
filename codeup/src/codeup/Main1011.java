package codeup;

import java.util.Scanner;

public class Main1011 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		// 여기까진 1010문제와 동일하다
		
		String value1 = scan.next();
		// 언어 구조 : 문자 변수명 = 스캔변수명.next(); 1010에서는 정수값이였기에 int가 붙었다. 문자는 뒤에 붙는게 없다.
		
		scan.close();
		// 1010과 마찬가지로 닫아주자.
		
		System.out.println(value1);
		
		
		
		
	}

}
