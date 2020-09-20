package codeup±‚√ 5_4;

import java.util.Scanner;

public class Main4701 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		

		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			
			}
		}
		
		int i = 0;
		int j = n-1;
		
		int gap = Integer.MAX_VALUE;
		int answer1 = 0;
		int answer2 = 0;
		
		int temp = 0;
		int sum = 0;
		
		while(i<j) {
			sum = arr[i] + arr[j];
			temp = Math.abs(sum);
			if(temp<gap) {
				gap = temp;
				answer1 = arr[i];
				answer2 = arr[j];
			}
			
			if(sum>0) {
				j--;
			}
			else {
				i++;
			}
		}
		
		System.out.println(answer1 + " " + answer2);
			
		scan.close();
	}

}
