package codeup����6;

import java.util.Scanner;

public class Main1581 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.printf(b+" "+a);
		}
		if(a<b) {
			System.out.printf(a+" "+b);
		}
		if(a==b) {
			System.out.println(a+" "+b);
		}
		scan.close();
	}

}
// �������� [�� ����������� Ǯ��µ� 	public static void main(String[] args) �̺κп��� []�� �Ⱦ� �� �ֳ��ʹ�.