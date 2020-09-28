package 관리자추천문제;

import java.util.Scanner;

public class Main3705 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = 0;
		int counta = 0;
		int countb = 1;
		int answer = Integer.MIN_VALUE;
		
		while(counta<n && countb<=n) {
			for(int i=counta; i<countb; i++) {
				max = max + arr[i];
				if(answer<max) {
					answer = max;
				}
			}
					
			if(countb>=n) {
				counta++;
				countb = counta+1;
			}
			
			countb++;
			max = 0;
	
		}
		
		System.out.println(answer);
		
	}

}

// 답이 나왔지만 시간초과가 떴다.