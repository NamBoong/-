package codeup;

import java.util.Scanner;

public class Main1074 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		
		while(true) {
			//if�� ���ǿ� ��ġ�� ���ȿ��� �Ʒ��� ���� �ൿ�� �ݺ��Ѵ�.
			int answer1 = i--;
			// anwer1�� i--�� �� ���̴�.
		if(i<0) {
			// i�� 0���� �۾����� �����.
			break;
		}
		System.out.println(answer1);
			scan.close();
		}
	}
}