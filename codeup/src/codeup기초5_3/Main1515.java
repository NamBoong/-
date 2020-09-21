package codeup±âÃÊ5_3;

import java.util.Scanner;

public class Main1515 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[25][25];
		int[][] arr2 = new int[25][25];
		int[][] arr3 = new int[25][25];
		
		for(int i=0; i<25; i++) {
			for(int j=0; j<25; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int count = 0;
		
		for(int i=0; i<25; i++) {
			for(int j=0; j<25; j++) {
							
				//12½Ã
				if(i-1>=0) {
				if(arr[i-1][j]==1) {
					count++;
				}
				}
				
				// 1
				if(i-1>=0 && j+1<25) {
				if(arr[i-1][j+1]==1) {
					count++;
				}
				}
				
				//3
				if(j+1<25) {
				if(arr[i][j+1]==1) {
					count++;
				}
				}
				
				//5
				if(i+1<25 && j+1<25) {
				if(arr[i+1][j+1]==1) {
					count++;
				}
				}
				
				//6
				if(i+1<25) {
				if(arr[i+1][j]==1) {
					count++;
				}
				}
				
				//7
				if(i+1<25 && j-1>=0) {
				if(arr[i+1][j-1]==1) {
					count++;
				}
				}
				
				//9
				if(j-1>=0) {
				if(arr[i][j-1]==1) {
					count++;
				}
				}
				
				//11
				if(i-1>=0 && j-1>=0) {
				if(arr[i-1][j-1]==1) {
					count++;
				}
				}
				
				arr2[i][j] = count;
				count =0;
			}
		}
		
		
		for(int i=0; i<25; i++) {
			for(int j=0; j<25; j++) {
				
				if(arr2[i][j]==3) {
					arr3[i][j]=1;
				}
				
				if(arr2[i][j]>=4 || arr2[i][j]<=1) {
					arr3[i][j]=0;
				}
				
				if(arr2[i][j]==2 && arr[i][j]==1) {
					arr3[i][j]=1;
				}
				
			}
		}
		
		
		for(int i=0; i<25; i++) {
			for(int j=0; j<25; j++) {
				System.out.printf(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
