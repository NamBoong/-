package codeup±‚√ 6;

import java.util.Scanner;

public class Main1571 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int k = scan.nextInt();
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]>k) {
				System.out.println(i+1);
				break;
			}
			if(arr[i]<=k) {
				count++;
			}
		}
		
		if(count==n) {
			System.out.println(n+1);
		}
		scan.close();
	}

}
