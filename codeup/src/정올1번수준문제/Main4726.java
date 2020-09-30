package 정올1번수준문제;

import java.util.Scanner;

public class Main4726 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count = 0;
		int sum = 0;
		int temp = Integer.MIN_VALUE;
		
		while(count+k<=n) {
			for(int i=count; i<count+k; i++) {
				sum = sum + arr[i];
			}
			if(sum>temp) {
				temp = sum;
				sum = 0;

			}
			count++;
			sum=0;
		}
		
		System.out.println(temp);
		scan.close();
	}

}
