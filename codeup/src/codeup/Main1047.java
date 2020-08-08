package codeup;

import java.util.Scanner;

public class Main1047 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		System.out.println(value1<<1);
		// 설명에서 알려준대로 <<는 곱하기 >>는 나누기를 이용해주자
		
		scan.close();
		
	}

}
