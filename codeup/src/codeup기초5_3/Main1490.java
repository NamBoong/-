package codeup����5_3;

import java.util.Scanner;

public class Main1490 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		 int[][] arr = new int[n][m];
	        
	        int count = 1;
	        int goal = n*m;
	        int i = n-1;
	        int j = 0;
	        int width = m-1;
	        int height = n;
	        
	        
	        while(count<=goal) {
	        	
	        	//����
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
	        	
	        	//��
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
	        	
	        	//����
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
	        	
	        	//�Ʒ�
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