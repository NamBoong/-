package codeup;

import java.util.Scanner;

public class Main1046 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Double value1 = scan.nextDouble();
		Double value2 = scan.nextDouble();
		Double value3 = scan.nextDouble();

		System.out.printf("%.0f\n", value1 + value2 + value3);
		// 1��° �������� ��µǰ� �ߴ�.
		System.out.printf("%.1f", (value1 + value2 + value3)/3);
		// �����°� ������ ���� ��� /3���� ������. ���� �������� ������ ī��Ʈ �ϴ¹��� �����غ����� �� ����.

		scan.close();
	}

}
