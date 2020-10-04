package 탐색기반설계;

import java.util.Scanner;

public class Main2651 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		long sum = 1;
		
		for(int i=k+1; i<=n; i++) {
			sum = sum*i;
		}
		
		long sum2 =1;
		for(int i=n-k; i>=1; i--) {
			sum2 = sum2*i;
		}
		

		System.out.println(sum/sum2);
		scan.close();
	}

}
