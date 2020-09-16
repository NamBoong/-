package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1511 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		int count = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		
		int sum = 0;
			for(int j=0; j<n; j++) {
				sum = sum + arr[0][j];
			}
		
			for(int j=1; j<n; j++) {
				sum = sum + arr[j][0];
			}
			
			for(int j=1; j<n; j++) {
				sum = sum + arr[j][n-1];
			}
			
			for(int j=1; j<n-1; j++) {
				sum = sum + arr[n-1][j];
			}	
		
		System.out.println(sum);
		
		scan.close();
	}

}
