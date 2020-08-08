package codeup;

import java.util.Scanner;

public class Main1052 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		if(value1!=value2) {
			System.out.println(1);

		}
		else {
			System.out.println(0);
			// if의 반대 조건이 필요하다면 else를 쓰자.
		}
		scan.close();
	}

}
