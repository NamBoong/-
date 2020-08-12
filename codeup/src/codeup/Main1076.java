package codeup;

import java.util.Scanner;

public class Main1076 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.next();
		
		for(int answer1=97; answer1 <= value1.getBytes()[0]; answer1++) {
			// 아스키코드 97이 a이다. a부터 시작해서 value1을 바이트로 바꾼 값과 일치하는지 확인시키고, 1씩 증가시켰다.
			System.out.println((char)answer1 + "");
			// 숫자를 다시 아스키코드 문자로 변경시켜준다. 
		}
		scan.close();
	}
}