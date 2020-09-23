package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1525 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[10][10];
		int[][] arr2 = new int[10][10];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				arr[i][j] = scan.nextInt();
				arr2[i][j] = arr[i][j];
			}
		}
		
		int n = scan.nextInt();
		int[] player = new int[n*2];
		for(int i=0; i<n*2; i++) {
				player[i] = scan.nextInt();
		}
		
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(arr[i][j]>=1) {
					
					
					// 12
					for(int a=0; a<=arr[i][j]; a++) {
						if(i-a>=0) {
							arr2[i-a][j] = -2;	
							if(arr[i-a][j] == -1) {
								arr2[i-a][j] = -1;
								break;
							}
						}
					}
					
					// 3
					for(int a=0; a<=arr[i][j]; a++) {
						if(j+a<10) {
							arr2[i][j+a] = -2;	
							if(arr[i][j+a] == -1) {
								arr2[i][j+a] = -1;	
								break;
							}
						}
					}
					
					// 6
					for(int a=0; a<=arr[i][j]; a++) {
						if(i+a<10) {
							arr2[i+a][j] = -2;					
							if(arr[i+a][j] == -1) {
								arr2[i+a][j] = -1;	
								break;
							}
						}
					}
					
					// 9
					for(int a=0; a<=arr[i][j]; a++) {
						if(j-a>=0) {
							arr2[i][j-a] = -2;	
							if(arr[i][j-a] == -1) {
								arr2[i][j-a] = -1;	
								break;
							}
						}
					}
					
					
				}
			}
		}
		
		int play = 1;
		for(int i=0; i<n*2; i++) {
			if(i%2==0 && i+1<n*2) {
				if(arr2[player[i]-1][player[i+1]-1]==0) {
					arr2[player[i]-1][player[i+1]-1] = play;
				}
				play++;
			}
		}
		
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.printf(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Character Information");
		
		int count = 1;
		
		for(int i=0; i<n*2; i++) {
			if(i%2==0 && i+1<n*2) {
				if(arr2[player[i]-1][player[i+1]-1]==-2) {
					System.out.printf("player " + count + " dead");
					count++;
				}
			
				if(arr2[player[i]-1][player[i+1]-1]!=-2) {
					System.out.printf("player " + count + " survive");
					count++;
				}
				System.out.println();
			}			
		}
		
		
		
		
		scan.close();
	}

}
