package codeup;

import java.util.Scanner;

public class Main1036 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char value1 = scan.nextLine().charAt(0);
		// value1�� �ƽ�Ű�ڵ�� �޾ƾ��ϴ� ���ڷ� ������ �ְ�, scan �ڿ� charAt�� �־ �ƽ�Ű �ڵ带 10������ ��ȯ���� �ش�.
		
		int answer1 = (int)value1;
		
		System.out.println(answer1);
		
		scan.close();
	  
		
	}

}
