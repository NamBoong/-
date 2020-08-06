package codeup;

import java.util.Scanner;

public class Main1034 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.nextLine();
		
		int answer = Integer.valueOf(value1, 8);
		// 변수 value1은 8진수라고 알려주며, 앞에 클래스는 그것을 10진수로 바꾸라고 형식을 알려주고있다.
		// 8쪽에 16, 2 등 다양한 숫자로 value1의 진수를 알릴 수 있다.
		
		System.out.println(answer);
		
		scan.close();
		
	}

}
