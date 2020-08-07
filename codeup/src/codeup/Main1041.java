package codeup;

import java.util.Scanner;

public class Main1041 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char value1 = scan.nextLine().charAt(0);
		// value1 변수를 아스키코드로 지정해준다.
		
		System.out.println((char)(value1 + 1));
		// value1에 1을 먼저 더하고, 그것을 다시  문자로 받아야하니 앞에 char를 써준다.
		
		scan.close();
	}

}
