package codeup;

import java.util.Scanner;

public class Main1061 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		
		System.out.println(value1 | value2);
		// shift+\�� �ϸ� |�� ��µȴ�. �� ���ڴ� ������ �������� Ȯ�������� �ϳ��� 1�� �ִٸ� �� �ڸ��� 1�� ������ִ� ���̴�.
		
		scan.close();
	}

}
