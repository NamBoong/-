package codeup;

import java.util.Scanner;

public class Main1059 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		int value2 = ~value1;
		// ~�� ���� 2������ 0�� 1�� 1�� 0���� �ٲ�� ��ȣ�� �ݴ�� �ȴ�.
		
		System.out.println(value2);
		
		scan.close();
	}

}
