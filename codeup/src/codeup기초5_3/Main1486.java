package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1486 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			int m = scan.nextInt();
			 int[][] arr = new int[n][m];
		        
		        int count = 1;
		        int goal = n*m;
		        int i = 0;
		        int j = m-1;
		        int width = m-1;
		        int height = n;
		        
		        
		        while(count<=goal) {
		   
		        	
		        	
		        	for(int a=0; a<height; a++) {	
		        		arr[i][j] = count;		        	
		        		i++;
		        		count++;	
		        		
		        	}
		        	
	        		if(count>goal) {
		        		break;
		        	}
		        	
		        	height--;
		        	i--;
		        	j--;
		        	
		        	
		        	
		        	for(int a=0; a<width; a++) {
		        		if(j>=0) {
		        			arr[i][j] = count;
		        			j--;
		        		}
		        			count++;	

		        	}
        			if(count>goal) {
		        		break;
		        	}
		        	width--;
		        	j++;
		        	i--;
		        	
		        	
		        	for(int a=0; a<height; a++) {
		        			arr[i][j] = count;
		        			i--;
		        			count++;
		        			if(count>goal) {
				        		break;
				        	}
		        	}
		        	height--;
		        	i++;
		        	j++;
		        	
		        	
		        	for(int a=0; a<width; a++) {
		        		arr[i][j] = count;
		        		j++;
		        		count++;	  
		        		if(count>goal) {
			        		break;
			        	}
		        	}
		        	width--;
		        	j--;
		        	i++;
		        	
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
