package codeup±‚√ 5;

import java.util.Scanner;

public class Main1411 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n-1];
		
		for(int i=0; i<n-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n-1; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int count = 0;
		
		for(int i=0; i<n-1; i++) {
			if(i+1!=arr[i]) {
				System.out.println(i+1);
				break;
			}
			
			if(i+1==arr[i]) {
				count++;
				
				if(count==n-1) {
					System.out.println(n);
				}
			}
		}

		
		scan.close();
	}

}
