package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1492 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int sum = 0;
		int[] arr2 = new int[n];
		
		for(int i=0; i<n; i++) {
			sum = sum + arr[i];
			arr2[i] = sum;
		}
		
		for(int i=0; i<n; i++) {
			System.out.printf(arr2[i] + " ");
		}
		scan.close();
	}

}
