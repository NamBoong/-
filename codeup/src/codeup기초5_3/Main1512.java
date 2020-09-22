package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1512 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int[][] arr = new int[n][n];
		
		int count = 1;
		
		arr[x-1][y-1] = 1;
		
		for(int i=y-1; i<n; i++) {
				arr[x-1][i] = count;	
			count++;
		}
		
		count = 1;
		
		for(int i=y-1; i>=0; i--) {
				arr[x-1][i] = count;	
			count++;
		}
		
		count = 1;
		
		for(int j=0; j<n; j++) {		
			for(int i=1; i<n; i++) {
				if(x-1-i>=0) {
					arr[x-1-i][j] = arr[x-i][j] + count;
				}
			}
			count = 1;
		}
		
		
		for(int j=0; j<n; j++) {		
			for(int i=1; i<n; i++) {
				if(x-1+i<n) {
					arr[x-1+i][j] = arr[x-2+i][j] + count;
				}
			}
			count = 1;
		}
		
				
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
