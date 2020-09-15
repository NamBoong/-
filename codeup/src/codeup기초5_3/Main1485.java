package codeup기초5_3;

import java.util.Scanner;

public class Main1485 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		
		int i = 0;
		int j = 0;
		int count = n*m;
		int goal = 1;
		int width = m;
		int heigh = n-1;
		
		
		while(count>=goal) {
		
			for(int a=0; a<width; a++) {
				arr[i][j] = count;
				count--;
				j++;
			}
			j--;
			width--;
			i++;
        	if(count<=goal) {
        		break;
        	}
        	
			for(int a=0; a<heigh; a++) {
				arr[i][j] = count;
				count--;
				i++;
			}
			i--;
			heigh--;
			j--;
        	if(count<=goal) {
        		break;
        	}
        	
			for(int a=0; a<width; a++) {
				arr[i][j] = count;
				count--;
				j--;

			}
			j++;
			width--;
			i--;

			
			for(int a=0; a<heigh; a++) {
				arr[i][j] = count;
				count--;
				i--;
			}
			i++;
			heigh--;
			j++;

		}
		
		
		
		for(int a=0; a<n; a++) {
			for(int b=0; b<m; b++) {
				System.out.printf(arr[a][b] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}

// 1484번과 같은 이유에서 막혔다. 일단 나머지 답은 잘 나왔으니 패스하자.