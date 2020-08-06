package codeup;

import java.util.Scanner;

public class Main1029 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double value1 = scan.nextDouble();
		//소숫점이 있으니 double로 변수를 입력합시다.
		
		System.out.printf("%.11f", value1);
		//소숫점 11번째자리까지만 나오자고했으니 11번째까지 출력되게 해달라는 추가 주문을 넣읍시다.
		
		scan.close();
		
	}

}
