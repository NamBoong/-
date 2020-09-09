package codeup±‚√ 5;

import java.util.Scanner;

public class Main1440 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		
		for(int i=0; i<n; i++) {
			System.out.printf((i+1) + ":");
		for(int j=0; j<n; j++) {
				
			if(arr[i]>arr[j]) {				
				System.out.printf(" " + ">");
			}
			
			if(arr[i]==arr[j] && i!=j) {				
				System.out.printf(" " + "=");
			}
			
			if(arr[i]<arr[j]) {				
				System.out.printf(" " + "<");
			}
			
			
			}
			System.out.printf("\n");			
		}
		scan.close();
		
	}

}
