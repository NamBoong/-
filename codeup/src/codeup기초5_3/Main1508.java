package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1508 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][n];
		
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][0] = a[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i-1>=0) {
				if(arr[i][j]!=0 && arr[i-1][j]!=0) {
					arr[i][j+1] = arr[i][j] - arr[i-1][j];
				}
				}
			}
		}		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==0) {
					System.out.printf("");
				}
				if(arr[i][j]!=0) {
					System.out.printf(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
