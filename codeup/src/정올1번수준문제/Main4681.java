package 정올1번수준문제;

import java.util.Scanner;

public class Main4681 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			arr[i] = scan.nextInt();
			
			sum = (int) (sum + Math.pow(arr[i], 2));
		}
		
		System.out.println(sum%10);
		scan.close();
	}

}
