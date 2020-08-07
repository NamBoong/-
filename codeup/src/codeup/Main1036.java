package codeup;

import java.util.Scanner;

public class Main1036 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char value1 = scan.nextLine().charAt(0);
		// value1은 아스키코드로 받아야하니 문자로 변수를 넣고, scan 뒤에 charAt를 넣어서 아스키 코드를 10진수로 변환시켜 준다.
		
		int answer1 = (int)value1;
		
		System.out.println(answer1);
		
		scan.close();
	  
		
	}

}
