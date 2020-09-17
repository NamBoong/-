package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1505 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int width = n;
		int high = n-1;
		int i = 0;
		int j = 0;
		int count = 1;
		int goal = n*n;
		int[][] arr = new int[n][n];
		
		while(count<=goal) {

        	for(int a=0; a<width; a++) {
        		arr[i][j] = count;
        		j++;
        		count++;	        		
        	}
        	width--;
        	j--;
        	i++;

        	
        	for(int a=0; a<high; a++) {
        		arr[i][j] = count;
        		i++;
        		count++;
        		
        	}
        	high--;
        	i--;
        	j--;

        	
        	
        	for(int a=0; a<width; a++) {
        			arr[i][j] = count;
        			j--;
        			count++;
        		
        	}
        	width--;
        	j++;
        	i--;

        	
        	for(int a=0; a<high; a++) {
        			arr[i][j] = count;
        			i--;
        			count++;
        		
        	}
        	high--;
        	i++;
        	j++;

        	
        }
		
		for(int a=0; a<n; a++) {
			for(int b=0; b<n; b++) {
				System.out.printf(arr[a][b] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
