package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1483 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		int count = 1;
		
		for(int i=0; i<n+m-1; i++) {
			for(int j=0; j<=n-1; j++) {
			for(int k=m-1; k>=0; k--) {


					if(j + i -n+1 == k) {
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