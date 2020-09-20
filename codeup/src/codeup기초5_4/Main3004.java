package codeup기초5_4;

import java.util.Scanner;

public class Main3004 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		int[] arr2 = arr.clone();
		
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			arr2[i] = arr[i];
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
		

		int goal = 0;
		for(int j=0; j<n; j++) {		
		for(int i=0; i<n; i++) {
			if(arr2[j]==arr[i]) {
				System.out.printf(goal + " ");

			}
			if(arr2[j]!=arr[i]) {
				goal++;
			}

		}
		goal = 0;
		}
		
		scan.close();
	}

}
// 답은 나오지만 시간 초과로 오류가 난다. 깔끔하게 넘기자.