package codeup±‚√ 5;

import java.util.Scanner;

public class Main1425 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int c = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i]<arr[j]) {
					int empt = arr[i];
					arr[i] = arr[j];
					arr[j] = empt;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			int count = 0;
			
			System.out.printf(arr[i] + " ");
			count=i+1;
			if(count%c==0) {
				System.out.printf("\n");
			}
		}
		scan.close();
	}

}
