package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1470 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		
		int count = 1;
		

		for(int j=0; j<n; j++) {
			for(int i=0; i<n; i++) {
			if(j%2==0) {
				arr[i][j] = count;
				count++;
			}
			}
			
			for(int i=n-1; i>=0; i--) {
			if(j%2==1) {
				arr[i][j] = count;
				count++;
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
