package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1497 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] arr2 = new int[n/2];
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(i%2==0 && i+1<n) {
			arr2[count] = Math.max(arr[i], arr[i+1]);
			count++;
			}
		}
		
		for(int i=0; i<n/2; i++) {
			System.out.printf(arr2[i] + " ");
		}
		scan.close();
		
	}

}
