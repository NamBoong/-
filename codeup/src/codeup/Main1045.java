package codeup;

import java.util.Scanner;

public class Main1045 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		System.out.println(value1 + value2);
		System.out.println(value1 - value2);
		System.out.println(value1 * value2);
		System.out.println(value1 / value2);
	
		   if(value2 > 0) {
		//������ ������ ������ �κи� �����°Ÿ� �����ߴ�.
			   
		System.out.println(value1%value2);
		
		double value3 = Integer.valueOf(value1);
		double value4 = Integer.valueOf(value2);
		System.out.printf("%.2f", value3 / value4);
		//int�� double�� �ٲ㼭 �Ҽ��� 2�ڸ������� ���������ߴ�.

		scan.close();

		   }
	}

}
