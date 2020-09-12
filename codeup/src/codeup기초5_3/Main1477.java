package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1477 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		int count = 1;
		
		for(int spin=0; spin<=n+m; spin++) {
			for(int i=0; i<n; i++) {
				int j = spin-i;
				if(j>=0 && j<m) {
					arr[i][j] = count;
					count++;
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
