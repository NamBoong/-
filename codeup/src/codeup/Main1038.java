package codeup;

import java.util.Scanner;

public class Main1038 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double value1 = scan.nextInt();
		double value2 = scan.nextInt();
		
		System.out.printf("%.0f", value1 + value2);
		// �Ҽ����� �������ʰ� �ϱ����� .0���� ǥ�����ش�.
		
		scan.close();
	}

}
