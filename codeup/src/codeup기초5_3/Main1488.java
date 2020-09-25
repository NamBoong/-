package codeup기초5_3;

import java.util.Scanner;

public class Main1488 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		 int[][] arr = new int[n][m];
	        
	        int count = 1;
	        int goal = n*m;
	        int i = n-1;
	        int j = m-1;
	        int width = m;
	        int height = n-1;
	        
	        
	        while(count<=goal) {
	        	
	        	//아래
	        	for(int a=0; a<width; a++) {
	        		arr[i][j] = count;
	        		j--;
	        		count++;
	        	}
	        	width--;
	        	j++;
	        	i--;
	        	if(count>goal) {
	        		break;
	        	}
	        	
	        	//왼쪽
	        	for(int a=0; a<height; a++) {
	        		arr[i][j] = count;
	        		i--;
	        		count++;
	        	}
	        	height--;
	        	i++;
	        	j++;
	        	if(count>goal) {
	        		break;
	        	}
	        	
	        	//위
	        	for(int a=0; a<width; a++) {
	        		arr[i][j] = count;
	        		j++;
	        		count++;
	        	}
	        	width--;
	        	j--;
	        	i++;
	        	if(count>goal) {
	        		break;
	        	}
	        	
	        	//오른
	        	for(int a=0; a<height; a++) {
	        		arr[i][j] = count;
	        		i++;
	        		count++;
	        	}
	        	height--;
	        	i--;
	        	j--;
	        	if(count>goal) {
	        		break;
	        	}
	        	
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