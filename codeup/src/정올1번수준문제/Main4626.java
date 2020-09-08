package 정올1번수준문제;

import java.util.Scanner;

public class Main4626 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int sum = 0;
		int count = 1;
		
		for(int i=0; i<n; i++) {
				if(arr[i]==1) {
					sum = sum + 1*count;
					
					count++;
				}
				if(arr[i]==0) {
					count = 1;
				}
		}
		
		System.out.println(sum);
		scan.close();
	}

}
