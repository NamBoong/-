package codeup;

import java.util.Scanner;

public class Main1053 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		if(value1==0) {
			System.out.println(1);
			//value1 ������ 0�� ������ 1�� ��µǰ� if�� �ۼ�
		}
		if(value1==1){
			System.out.println(0);
			//value1 ������ 1�� ������ 0�� ��µǰ� if�� �ۼ�
		}
		
		scan.close();
	}

}
