package codeup;

import java.util.Scanner;

public class Main1072 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		int[] arr = new int[value1];
		// arr 배열이기며 입력되는 정수를 받는다.
		
		for(int i=0; i<value1; i++) {
			// i가 value1에 입력될 수까지 1씩 증가하게 만든다.
			arr[i] = scan.nextInt();
			// 배열이 i(0부터) 주어진 정수를 인식한다.
		}
		
		for(int i=0; i<value1; i++) {
			System.out.println(arr[i]);
			// 배열에 따라 값을 하나씩 출력하게 한다. 윗줄의 for과 연관있다.
		}
		scan.close();
		
	}

}
