package codeup;

import java.util.Scanner;

public class Main1033 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();

		String print1 = String.format("%X", value1);
		// format해줘야하는 것을 잊고있었다.
		// 계속 시스템아웃에서 형식을 지정해주지말고, 그 전 단계에서 포멧으로 형식을 만들어주자.
		
		System.out.println(print1);
		
		scan.close();
		
	}

}
