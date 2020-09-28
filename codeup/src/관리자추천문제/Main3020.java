package 관리자추천문제;

import java.util.Scanner;

public class Main3020 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arrn = new int[n];
		
		for(int i=0; i<n; i++) {
			arrn[i] = scan.nextInt();
		}
		
		int m = scan.nextInt();
		int[] arrm = new int[m];
		
		for(int i=0; i<m; i++) {
			arrm[i] = scan.nextInt();
		}
		
		int count = 0;
		int nocount = 0;
		
		while(count<m) {
			
			for(int i=0; i<n; i++) {
				if(arrn[i]==arrm[count]) {
					System.out.printf((i+1) + " ");
				}
				if(arrn[i]!=arrm[count]) {
					nocount++;
					if(nocount==n) {
						System.out.printf(-1 + " ");
					}
				}
				
			}
			nocount = 0;
			count++;
		}
		
		scan.close();
	}

}

// 시간초과가 나오나 답은 잘 나옴