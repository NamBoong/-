package 관리자추천문제;

import java.util.Scanner;

public class Main3002 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr1 = new int[n];
		
		for(int i=0; i<n; i++) {
			arr1[i] = scan.nextInt();
		}
		
		int m = scan.nextInt();
		int[] arr2 = new int[m];
		
		for(int i=0; i<m; i++) {
			arr2[i] = scan.nextInt();			
		}
		
		int count = 0;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(arr2[i]==arr1[j]) {
					System.out.printf((j+1) + " ");
				}
				if(arr2[i]!=arr1[j]) {
					count++;
				}
				if(count==n-1) {
					System.out.printf(-1 + " ");
				}
			}
		}
		
		scan.close();
	}

}
// 답이 나왔지만 시간초과이다.