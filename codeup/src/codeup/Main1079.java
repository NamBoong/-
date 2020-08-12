package codeup;

import java.util.Scanner;

public class Main1079 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			char value1 = scan.next().charAt(0);
			// charAt 인수의 0번째 문자를 읽는다.
			if(value1=='q') {
				System.out.println("q");
				break;
			}
			System.out.println(value1);
		}
		scan.close();
	}

}
