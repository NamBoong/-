package codeup;

import java.util.Scanner;

public class Main1015 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		float value1 = scan.nextFloat();
		// ���� 1���� �ݿø� �ϱ⿡ double�� �ƴ϶� �̹��� float�� �ް�, next�ڴ� ���� ������ float���� �޴´�.
		
		System.out.printf(String.format("%.2f",value1));
		//system.out.print''''ln''''�� �ƴϴ�!!! f�� �������. �Ҽ��� 3��°�ڸ����� 2��°������ ������ ���ڴٰ��ϴ�, ��Ƴ��⸦ ���ϴ� �ڸ����� ���ְ� "%.2f" �ڿ� f�� �ٿ�����.
		//����� .�� ������ �Ҽ������� �ݿø����ϴϱ� �� ������.
		
		scan.close();
				
		
	}

}
