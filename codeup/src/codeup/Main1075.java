package codeup;

import java.util.Scanner;

public class Main1075 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		while(true) {
			//if�� ���ǹ��� ���� �� ���� �ƴҶ����� �Ʒ��� ���� �۾��� �����Ѵ�.
			int i = --value1;
			// ���� i�� value1 ���� -1 �� ���̴�.
			if(i<0) {
				break;
				// ���� i�� 0���� �۾����ٸ� �����.(��, 0�� �ȴٴ� �Ҹ�)
			}
			System.out.println(i);
		}
		scan.close();
	}

}
