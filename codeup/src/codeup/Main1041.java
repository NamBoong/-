package codeup;

import java.util.Scanner;

public class Main1041 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char value1 = scan.nextLine().charAt(0);
		// value1 ������ �ƽ�Ű�ڵ�� �������ش�.
		
		System.out.println((char)(value1 + 1));
		// value1�� 1�� ���� ���ϰ�, �װ��� �ٽ�  ���ڷ� �޾ƾ��ϴ� �տ� char�� ���ش�.
		
		scan.close();
	}

}
