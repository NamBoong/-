package codeup;

import java.util.Scanner;

public class Main1061 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		System.out.println(value1 | value2);
		// shift+\를 하면 |가 출력된다. 이 문자는 정수를 진법으로 확인했을때 하나라도 1이 있다면 그 자리를 1로 만들어주는 수이다.
		
		scan.close();
	}

}
