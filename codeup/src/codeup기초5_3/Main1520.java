package codeup기초5_3;

import java.util.Scanner;

public class Main1520 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int[][] arr = new int[a][b];
		
		int live = scan.nextInt();
		int safe = scan.nextInt();
		int death = scan.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int rutine = scan.nextInt();
		
		int count = 0;
		int[][] arr2 = new int[a][b];
		int[][] arr3 = new int[a][b];
		
		int goal = 0;
		
		
		while(goal<rutine) {
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
							
				//12시
				if(i-1>=0) {
				if(arr[i-1][j]==1) {
					count++;
				}
				}
				
				// 1
				if(i-1>=0 && j+1<b) {
				if(arr[i-1][j+1]==1) {
					count++;
				}
				}
				
				//3
				if(j+1<b) {
				if(arr[i][j+1]==1) {
					count++;
				}
				}
				
				//5
				if(i+1<a && j+1<b) {
				if(arr[i+1][j+1]==1) {
					count++;
				}
				}
				
				//6
				if(i+1<a) {
				if(arr[i+1][j]==1) {
					count++;
				}
				}
				
				//7
				if(i+1<a && j-1>=0) {
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
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
									
				if(arr2[i][j]==live) {
					arr3[i][j]=1;
				}
				
				if(arr2[i][j]>=death || arr2[i][j]<safe) {
					arr3[i][j]=0;
				}
				
				if(arr[i][j]==1) {
				if(arr2[i][j]<death && arr2[i][j]>=safe) {
						arr3[i][j]=1;
					}
				}
				

			}
		}
		
		
		if(death>safe) {
			
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				arr[i][j] = arr3[i][j];		
			}
		}
		}
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
		if(arr2[i][j]>=2) {
		if(death<safe) {
			
		for(int c=0; c<a; c++) {
			for(int d=0; d<b; d++) {
				arr[c][d] = arr2[c][d];		
			}
		}
		}
		}
			}
		}
		
			goal++;
		}
		
		if(death<safe) {
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.printf(arr2[i][j] + " ");
			}
			System.out.println();
		}
		}
		
		
		if(death>safe) {
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.printf(arr3[i][j] + " ");
			}
			System.out.println();
		}
		}
		scan.close();
	}

}


// 현재 테스트케이스 2에서 오류가 나고잇다.
// 2이상의 수가 출력되며, 최소 생명조건 수보다 생명 초과시 죽는 수가 높은 케이스에만 나타나고있다....ㅠㅠ