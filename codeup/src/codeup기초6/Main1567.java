package codeup±‚√ 6;

import java.util.Scanner;

public class Main1567 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		long answer = 0;
		
		for(int i=a; i<=b; i++) {
			answer = answer + arr[i-1];
		}
		
		System.out.println(answer);
		scan.close();
	}

}
