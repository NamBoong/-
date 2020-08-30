package codeup기초5_4;

import java.util.Scanner;

public class Main3014 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int k=i+1; k<n; k++) {
				if(arr[i]>arr[k]) {
					int empt = arr[i];
					arr[i] = arr[k];
					arr[k] = empt;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.printf(arr[i] + " ");
		}
		scan.close();
	}

}
// 정답은 나오지만 자바로는 시간초과가 나오는 한계가 있다. 과감히 정답이 나오면 넘어가자.