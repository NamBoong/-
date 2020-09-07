package 정올1번수준문제;

import java.util.Scanner;

public class Main4531 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = scan.nextInt();
		}
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum/5);
		
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int k=0; k<5; k++) {
		System.out.println(arr[2]);
		break;
		}
		scan.close();
	}

}
