package codeup;

import java.util.Scanner;

public class Main1060 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		System.out.println(value1 & value2);
		// ������ ���� ���̿� &�� ���̸� 2���� �ڵ� �� ���� ��ġ�ϴ� 1�κи� ��µȴ�.
		
		scan.close();
	}

}
