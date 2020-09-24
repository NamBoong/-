package 탐색기반설계;

import java.util.Scanner;

public class Main5123 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int arrline = 0;
		int count = 0;
		
		while(arrline<n) {
			
			for(int i=arrline+1; i<n; i++) {
				if((arr[arrline]+arr[i])%3==0) {
					count++;
				}
			}
			arrline++;
		}
		
		System.out.println(count);
		scan.close();
	}

}
