package codeup±‚√ 5_4;

import java.util.Scanner;

public class Main1709 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int j=0; j<n; j++) {
			for(int k=0; k<n; k++) {
				if(arr[j]>arr[k]) {
					int tmep = arr[j];
					arr[j] = arr[k];
					arr[k] = tmep;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.printf(arr[i] + " ");
		}
		scan.close();
	}

}
