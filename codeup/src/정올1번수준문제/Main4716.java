package 정올1번수준문제;

import java.util.Scanner;

public class Main4716 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[20];
		int sum = 0;
		int answer = 0;
		
		for(int i=0; i<20; i++) {
			arr[i] = scan.nextInt();
			
			if(i%2==0) {
				sum = sum - arr[i];
		}
			if(i%2==1) {
				sum = sum + arr[i];
			}
			
			if(sum>answer) {
				answer = sum;
			}
			
		}
		System.out.println(answer);
		scan.close();
	}

}
