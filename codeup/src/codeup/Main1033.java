package codeup;

import java.util.Scanner;

public class Main1033 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();

		String print1 = String.format("%X", value1);
		// format������ϴ� ���� �ذ��־���.
		// ��� �ý��۾ƿ����� ������ ��������������, �� �� �ܰ迡�� �������� ������ ���������.
		
		System.out.println(print1);
		
		scan.close();
		
	}

}
