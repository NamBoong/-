package 정을1번수준문제;

import java.util.Scanner;

public class Main4026 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];

		for(int i=0; i<5; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;					
				}
			}
		}
			System.out.println(arr[2]);
		scan.close();
	}

}
