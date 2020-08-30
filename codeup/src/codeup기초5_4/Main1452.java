package codeup기초5_4;

import java.util.Scanner;

public class Main1452 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int j=0; j<n; j++) {
			for(int k=j+1; k<n; k++) {
				if(arr[j]>arr[k]) {
					int tmep = arr[j];
					arr[j] = arr[k];
					arr[k] = tmep;
			}
		}
	}
		for(int a=0; a<n; a++) {
		System.out.println(arr[a]);
		}
		scan.close();
	}

}
// 잘 되지만 시간초과로 나온다. 답은 구했으니 오케이다.