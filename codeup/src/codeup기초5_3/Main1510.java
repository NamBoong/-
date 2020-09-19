package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1510 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][n];
		
		int a = 0;
		int b = n/2;
		
		for(int k=1; k<=n*n; k++) {
			
			arr[a][b] = k;
			
			if(k%n!=0) {
				a = a-1;
				b = b+1;
			}
			else {
				a = a+1;
			}
			
			if(a == -1) {
				a = n-1;
			}
			if(a == n) {
				a = 0;
			}
			if(b == n) {
				b = 0;
			}
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
