package codeup����4_2;

import java.util.Scanner;

public class Main1371 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
		for(int j=n; i+1<j; j--) {
			System.out.printf(" ");
		}
			System.out.printf("*");
		//���� ��
		
		for(int a=n; n-a<i; a--) {
			System.out.printf("  ");
		}
			System.out.printf("*");
			
			System.out.printf("\n");
		}	
		//������ ��
		
		for(int i=0; i<n; i++) {
		for(int a=n; n-a<i; a--) {
			System.out.printf(" ");
		}
			System.out.printf("*");
		//���� �Ʒ�
			
		for(int k=1; n-k>i; k++) {
			System.out.printf("  ");
		}
			System.out.printf("*");
			System.out.printf("\n");
		}
		//������ �Ʒ�
		
		scan.close();
	}

}
