package codeup;

import java.util.Scanner;

public class Main1075 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		while(true) {
			//if의 조건문이 참일 때 참이 아닐때까지 아래와 같은 작업을 수행한다.
			int i = --value1;
			// 정수 i는 value1 값에 -1 된 값이다.
			if(i<0) {
				break;
				// 만약 i가 0보다 작아진다면 멈춰라.(즉, 0은 된다는 소리)
			}
			System.out.println(i);
		}
		scan.close();
	}

}
