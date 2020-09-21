package codeup기초5_3;

import java.util.Scanner;

public class Main1493 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		int[][] arr2 = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int sum = 0;
		int a = 0;
		int b = 0;
		
		
		// 2번째줄부터 안나오고있음
		while(a<n && b<m) {		

				for(int k=0; k<a+1; k++) {
					for(int l=0; l<b+1; l++) {
						sum = sum + arr[k][l];						
						arr2[a][b] = sum;
						
					}
					b++;
					sum = 0;
					
				}
				
				if(b>m) {
					b=0;
					sum = 0;
					a++;
				}

		}
		
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.printf(arr2[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
