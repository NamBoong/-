package codeup;

import java.util.Scanner;

public class Main1071 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1;
		while(true) {
			value1 = scan.nextInt();
			
			if(value1==0)
				break;
			// 0�� �������� ���߰� �ű���� ��ĵ�϶�� �Ǿ��ִ�.
				System.out.println(value1);
		}

		scan.close();
	}
}
