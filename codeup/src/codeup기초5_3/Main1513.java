package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1513 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = 0;
			}
		}
		
		int a = n-1;
		int b = 0;
		int width = 0;
		
		for(int count=1; count<=n*n; count++) {
			if(arr[n-1][n-1] !=0) {
				break;
			}
			if(a>=0 && b>=0 && a<n && b<n) {
			arr[a][b] = count;
			}
			
			if(width%2==0) {
				if(b==n-1) {
					a++;
					count++;
					if(a>=0 && b>=0 && a<n && b<n) {
					arr[a][b] = count;
					}
					width++;
				}
				if(b<n-1) {
					a--;
					b++;
				}
			}
			
			if(width%2==1) {

				
				if(a>=n-1) {
					b++;
					width++;
				}
				if(a<n-1) {
					a++;
					b--;
				}
				
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
