package codeup;

import java.util.Scanner;

public class Main1054 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		if(value1==1 && value2==1) {
			// &&는 여러개의 조건을 걸고싶을때 쓴다.
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		scan.close();
		
	}

}
