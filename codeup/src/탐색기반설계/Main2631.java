package 탐색기반설계;

import java.util.Scanner;

public class Main2631 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int sum = 0;
		int count = 0;
		int arrplus = 0;
		
		while(arrplus<n) {
			for(int i=arrplus; i<n; i++) {
				sum = sum + arr[i];
				if(sum==k) {
					count++;
					break;
				}
				if(sum>k) {
					break;
				}
			}
			sum = 0;
			arrplus++;
		}
		
		System.out.println(count);
		scan.close();
	}

}
