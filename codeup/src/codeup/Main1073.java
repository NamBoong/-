package codeup;

import java.util.Scanner;

public class Main1073 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// ���� true�� ���ȸ� �۵��Ѵٷ� �����Ѵ�.
			int value1 = scan.nextInt();
			// value1�� ���� ��ĵ�ϴ� ������.
			if(value1==0) {
				break;
				// value1�� ���� 0�� �Ǵ� ���� ��������.
			}
			System.out.println(value1);
			// �׸��� ������ ��(0�� ���� ���������� ���ð��̴�) �װ��� ��½�Ų��.
		}
		scan.close();
   }
}
// ���� �ȳ��ͼ� ���ۿ� �ĺ��� ���� ã�Ҵµ� �ʹ����� ������ ��ȿ� ��Ż�ϴ�....�Ф�