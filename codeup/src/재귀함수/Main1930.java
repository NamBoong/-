package ����Լ�;

import java.util.Scanner;

public class Main1930 {

	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();

	public static void answer(int num) {

		
		if(num==n+1) {
			return;
		}
		
		else {
		
			System.out.println("*".repeat(num));
			// �ڵ������ �̺κп��� cannot find symbol�̶�� �߸� ������ ����. ���⿡���� ����� �߸� ���´٤Ф�
			answer(num+1);
			return;
		}
		
	}
	
	public static void main(String[] args) {
		
		answer(1);
	}

}
