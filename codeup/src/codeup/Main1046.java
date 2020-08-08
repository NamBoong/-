package codeup;

import java.util.Scanner;

public class Main1046 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Double value1 = scan.nextDouble();
		Double value2 = scan.nextDouble();
		Double value3 = scan.nextDouble();

		System.out.printf("%.0f\n", value1 + value2 + value3);
		// 1번째 수까지만 출력되게 했다.
		System.out.printf("%.1f", (value1 + value2 + value3)/3);
		// 나누는걸 아직은 수가 적어서 /3으로 나눴다. 수가 많아지면 변수를 카운트 하는법을 생각해봐야할 것 같다.

		scan.close();
	}

}
