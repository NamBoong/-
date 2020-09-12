package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1478 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		int count = 1;
		

		for(int j=0; j<=n+m-2; j++) {
			for(int i=0; i<n; i++) {
				for(int k=m-1; k>=0; k--) {
					if(i+(m-1-k)==j) {
					arr[i][k] = count;
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
