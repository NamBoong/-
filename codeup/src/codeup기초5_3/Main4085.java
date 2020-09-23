package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main4085 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int[][] arr = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int sum = 0;
		int best = 0;
		int yline = 0;
		int xline = 0;
		
		while(yline+y<=n && xline+x<=m) {

				for(int i=yline; i<yline+y; i++) {
					for(int j=xline; j<xline+x; j++) {
						sum = sum + arr[i][j];
						
					}
				}		
			
			if(sum>best) {
				best = sum;
			}
			xline++;
			sum = 0;
			if(xline+x==m+1) {
				yline++;
				xline=0;
				sum = 0;
			}
	
		}
				
		System.out.println(best);
		scan.close();
	}

}
