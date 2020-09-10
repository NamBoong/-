package codeup기초5_3;

import java.util.Scanner;

public class Main1099 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[10][10];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				arr[i][j] = scan.nextInt();
				
			}
		}
		
		arr[1][1] = 9;
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				if(i+1<10 && j+1<10) {
				if(arr[i][j]==9 && arr[i][j+1]==0 && arr[i][j+1]!=2) {
					arr[i][j+1]=9;
				}
				
				if(arr[i][j]==9 && arr[i][j+1]==1 && arr[i+1][j]!=2) {
					arr[i+1][j]=9;
				}
				
				}
				
				if(arr[i][j]==2) {
					arr[i][j]=9;
					break;
				}
			}
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.printf(arr[i][j] + " ");
			}
			System.out.printf("\n");
		}
		scan.close();
	}

}

// 테스트 케이스가 오류가 있게 나온 것 같아서 일단은 정답과 동일하게 나왔으니 패스
