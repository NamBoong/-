package codeup;

import java.util.Scanner;

public class Main1055 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		if(value1==1 || value2==1) {
			// ||�� \+shift ���� Ű�̴�.
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		scan.close();
	}

}
