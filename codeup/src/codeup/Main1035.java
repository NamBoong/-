package codeup;

import java.util.Scanner;

public class Main1035 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.nextLine();
		
		Integer answer1 = Integer.valueOf(value1, 16);
		// 16������ ���� value1�� ���� 10������ �ٲ����.
		
		String print1 = Integer.toOctalString(answer1);
		// �̹��� 10������ �ٲ� answer1 ����(�� value1)�� 8������ �ٲ����.
		
		System.out.println(print1);
		
		scan.close();
	}

}
