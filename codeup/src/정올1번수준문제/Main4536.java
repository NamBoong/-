package 정올1번수준문제;

import java.util.Scanner;

public class Main4536 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		int sum = 0;
		for(int i=0; i<10; i++) {
			arr[i] = scan.nextInt();
			sum = sum + arr[i];
			

		}
		
		System.out.println(sum/10);
		
		for(int i=0; i<10; i++) {
			if(i+1<10) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			}
		}
		
		int i = 0;
		int count = 0;
		
		int gap = Integer.MIN_VALUE;
		int answer1 = 0;
		
		while(i<8) {
			if(i-1>=0) {
			if(count>=gap) {
				gap = count;
				answer1 = arr[i-1];
			}
			}
			if(arr[i]==arr[i+1]) {
				count++;
				i++;
			}
			else {
				count = 0;
				i++;
			}
			
		}
		System.out.println(answer1);
		scan.close();
	}

}