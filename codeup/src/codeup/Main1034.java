package codeup;

import java.util.Scanner;

public class Main1034 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.nextLine();
		
		int answer = Integer.valueOf(value1, 8);
		// ���� value1�� 8������� �˷��ָ�, �տ� Ŭ������ �װ��� 10������ �ٲٶ�� ������ �˷��ְ��ִ�.
		// 8�ʿ� 16, 2 �� �پ��� ���ڷ� value1�� ������ �˸� �� �ִ�.
		
		System.out.println(answer);
		
		scan.close();
		
	}

}
