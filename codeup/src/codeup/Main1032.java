package codeup;

import java.util.Scanner;

public class Main1032 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		System.out.println(Integer.toHexString(value1));
		//이번엔 16진수이다. 16진수=Hex 헥사곤의 줄인말같다.
		
		scan.close();
				
	}

}
