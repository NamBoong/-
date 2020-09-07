package 정올1번수준문제;

import java.util.Scanner;

public class Main4031 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[7];
		
		for(int i=0; i<7; i++) {
			arr[i] = scan.nextInt();
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
		
		int even = 0;
		int odd = 0;
	
		for(int i=0; i<7; i++) {
			if(arr[i]%2==0) {
				even = arr[i];
			}
			if(arr[i]%2==1) {
				odd = arr[i];
			}
		}

		System.out.println(even+odd);
		scan.close();
	}

}
