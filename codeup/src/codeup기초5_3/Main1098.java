package codeup����5_3;

import java.util.Scanner;

public class Main1098 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int arr[][] = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = 0;
				
			}
		}
		
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
		
		if(b==0) {
		for(int j=0; j<a; j++) {	
		if(x-1<n && y-1+j<m) {	

				arr[x-1][y-1+j] = 1;
			}
			
		}
		}

		if(b==1) {
		for(int j=0; j<a; j++) {	
		if(x-1+j<n && y-1<m) {	

				arr[x-1+j][y-1] = 1;
			}
		}
		}
	}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf(arr[i][j] + " ");
			}
			System.out.printf("\n");
		}
		
		scan.close();
	}

}

// ���� �������� ���� �� ������� ������ �������� �߻��Ѵ�. ������ �Ѿ��.