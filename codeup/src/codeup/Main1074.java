package codeup;

import java.util.Scanner;

public class Main1074 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		
		while(true) {
			//if의 조건에 일치할 동안에만 아래와 같은 행동을 반복한다.
			int answer1 = i--;
			// anwer1은 i--를 한 값이다.
		if(i<0) {
			// i가 0보다 작아지면 멈춰라.
			break;
		}
		System.out.println(answer1);
			scan.close();
		}
	}
}