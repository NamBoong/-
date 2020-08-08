package codeup;

import java.util.Scanner;

public class Main1047 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		System.out.println(value1<<1);
		// 설명에서 알려준대로 <<a는 2의 제곱승을  >>a는 루트라는 것을 이용해주자
		// 이전에 곱하기와 나누기라고 말했다. 멍청이...ㅠㅠ
		
		scan.close();
		
	}

}
