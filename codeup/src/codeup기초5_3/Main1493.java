package codeup±‚√ 5_3;

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
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				sum = sum + arr[i][j] ;
				arr2[i][j] = sum;
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
