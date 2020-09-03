package codeup±‚√ 6;

import java.util.Scanner;

public class Main1536 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[0]);
		scan.close();
	}

}
