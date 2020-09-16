package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1524 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int count = 0;
		
		
		if(n-1>=0 && n-1<9 && m-1>=0 && m-1<9) {
			if(arr[n-1][m-1]==1) {
				System.out.println(-1);
			}
		
			
			if(arr[n-1][m-1]==0) {
					
				if(n-2>=0) {
					if(arr[n-2][m-1]==1) {
						count++;
					}
				}

				if(n-2>=0 && m<9) {
					if(arr[n-2][m]==1) {
						count++;
					}
				}
				
				if(m<9) {
					if(arr[n-1][m]==1) {
						count++;
					}
				}
				
				if(m<9 && n<9) {
					if(arr[n][m]==1) {
						count++;
					}
				}
					
				if(n<9) {
					if(arr[n][m-1]==1) {
						count++;
					}
				}
				
				if(m-2>=0 && n<9) {	
					if(arr[n][m-2]==1) {
						count++;
					}
				}
				
				if(m-2>=0) {		
					if(arr[n-1][m-2]==1) {
						count++;
					}
				}
					
				if(m-2>=0 && n-2>=0) {
					if(arr[n-2][m-2]==1) {
						count++;
					}
				}
					
					System.out.println(count);
				}			
			
		}	
			
		scan.close();
	}

}
