package ����Լ�;

import java.util.Scanner;

public class Main1901 {
	
	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();
	// �������� n�� ����������.
	
	
	public static void main(String[] args) {

		answer(1);
	// ���� 1�� ����.
	}
	
	public static void answer(int num) {
		
		if(num==n+1) {
			return;
		//n+1�� �Ǹ� ����޶������. �� 5���� ��µǾ���ϸ� 6�� ���;��Ѵ�.
		}
		
		else {
			System.out.println(num);
			
			answer(num+1);
			// num ����� �ϰ� answer�� num+1�� ������ �ٲ��ش�.
		}
		
	}
	

}
