package codeup;

import java.util.Scanner;

public class Main1064 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		int value3 = scan.nextInt();
		
		System.out.println((value1<value2 ? value1:value2)<value3 ? (value1<value2 ? value1:value2) : value3);
		// 가장 작은 수를 출력하길 원했으니, 부등호를 반대로 입력해주자.
		
		scan.close();
	}

}
