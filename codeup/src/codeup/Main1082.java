package codeup;

import java.util.Scanner;

public class Main1082 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.next();
		
		for(int v=1; v<=16; v++) {
			//a�� ���� ���� ���
			int a = v;
			String b = Integer.toHexString(a);
			System.out.println(value1 + "*" + v + "=" + b);
		}
		
		scan.close();
	}

}
// ���� 16������ ������ ���ް� �ִ�. ���� ���游 �Ǹ� �� �� ����.
