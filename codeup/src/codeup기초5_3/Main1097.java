package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1097 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[20][20];
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				arr[i][j] = scan.nextInt();
				
			}
			
		}
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
		
		
		for(int j=0; j<arr.length; j++) {
				if(arr[x-1][j]==1) {
					arr[x-1][j]=0;
				}
					else {
						arr[x-1][j]=1;
					}
				
				
				if(arr[j][y-1]==1) {
					arr[j][y-1]=0;
				}
					else {
						arr[j][y-1]=1;
					}
				}
		}

		
		
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				System.out.printf(arr[i][j] + " ");
				
			}
			System.out.printf("\n");
			
		}
		scan.close();
	}

}
