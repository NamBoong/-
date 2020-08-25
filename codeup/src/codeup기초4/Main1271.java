package codeup±‚√ 4;

import java.util.Scanner;

public class Main1271 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		int max = 0;
		int b = 1;
		int c = 2;
		
		for(int i=0; i<=n; i++) {
			arr[i] = scan.nextInt();
		for(b=1; b<i; b++) {
		for(c=2; c<i; c++) {
			if(arr[i]>max) {
				max = arr[i];
				System.out.println(max);
			}
		}
		}
		}

		scan.close();
	}
}
