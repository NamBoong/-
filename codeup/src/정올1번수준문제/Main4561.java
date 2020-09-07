package 정올1번수준문제;

import java.util.Scanner;

public class Main4561 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[7];
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<7; i++) {
			arr[i] = scan.nextInt();
			
			if(arr[i]%2==1) {
			sum = sum + arr[i];
			}
			
			if(arr[i]%2==0) {
				count++;
			}
		}
		
		if(count==7) {
			System.out.println(-1);
		}
		else {
		System.out.println(sum);
		}
		
		for(int i=0; i<7; i++) {
			for(int j=i+1; j<7; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(int i=0; i<7; i++) {
			if(arr[i]%2==1) {
			System.out.println(arr[i]);
			break;
		}
		}
		scan.close();
	}

}
