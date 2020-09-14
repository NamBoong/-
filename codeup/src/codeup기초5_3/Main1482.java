package codeup±âÃÊ5_3;

import java.util.Scanner;

public class Main1482 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		int count = 1;
		
		for(int i=n+m-1; i>=0; i--) {
			for(int j=n-1; j>=0; j--) {
			for(int k=0; k<=m-1; k++) {
				if(-k+m + j == i) {
				
						arr[j][k] = count;
						count++;
				}	
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.printf(arr[i][j] + " ");
			}
			System.out.printf("\n");
		}
		scan.close();
		
	}

}