package codeup±‚√ 6;

import java.util.Scanner;

public class Main1551 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=1; i<=n; i++) {
			arr[i-1] = scan.nextInt();
		}
		
		int k = scan.nextInt();
		int count = 0;
		
		for(int i=1; i<=n; i++) {
			if(arr[i-1]==k) {
				System.out.println(i);
				break;
			}
			if(arr[i-1]!=k) {
				count++;
				if(count==n) {
					System.out.println(-1);
				}
			}

		
		}
		scan.close();

	}

}
