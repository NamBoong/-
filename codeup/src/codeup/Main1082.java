package codeup;

import java.util.Scanner;

public class Main1082 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.next();
		
		for(int v=1; v<=16; v++) {
			//a�� ���� ���� ���

			int a = v;
			int b = Integer.valueOf(a);
			String c = Integer.toHexString(b);
			System.out.println(value1 + "*" + stringToHex(v) + "=" + c );
		}
		
		scan.close();
	}

	private static int stringToHex(int v) {
		// TODO Auto-generated method stub
		return 0;
	}

}
// ���� 16������ ������ ���ް� �ִ�. ���� ���游 �Ǹ� �� �� ����.
