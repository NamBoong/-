package codeup;

import java.util.Scanner;

public class Main1019 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		String value1 = scan.next();
		
		String[] arr = value1.split("\\.");
		
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		System.out.printf("%04d.%02d.%02d",year,month,day);
		//0000.00.00 �������� ���;��Ѵٰ� ���ÿ� �����ִ�.
		//month�� ��� 1���� ��� 1018�� ������ ���� "%d"�� �ڵ��� ��� 0000.0.0���� ������ �Ǵϱ� �� �� ���� ���ڷ� ǥ���ض��� ������������.
		
		scan.close();
		
	}

}
