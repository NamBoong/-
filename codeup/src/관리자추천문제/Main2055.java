package ��������õ����;

import java.util.Scanner;

public class Main2055 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i=1; i<=Math.max(a, b); i++) {
			if(a%i==0) {
				System.out.printf(i + " ");
			}
			
			if(b%i==0 && a%i!=0) {
				System.out.printf(i + " ");
			}
		}
		
		scan.close();
	}

}

// ���� �������� �ð��ʰ��� ���´�.