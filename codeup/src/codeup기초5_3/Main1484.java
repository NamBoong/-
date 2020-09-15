package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1484 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		int count = 1;

		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				
				
					arr[i][j] = count;
					count++;
					System.out.printf(arr[i][j] + " ");
				
				
				if(j==m-1) {
					i++;
					System.out.printf(arr[i][m-1] + " ");
					count++;
				}
				
			}
			System.out.printf("\n");
		}
		scan.close();
	}

}
