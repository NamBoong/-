package 정올1번수준문제;

import java.util.Scanner;

public class Main4591 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr= new int[9];
		int[] arr2 = arr.clone();
		
		for(int i=0; i<9; i++) {
			arr[i] = scan.nextInt();
			arr2[i] = arr[i];
		}
		
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<9; i++) {
			if(arr[0]==arr2[i]) {
				System.out.println(arr[0]);
				System.out.println(i+1);
			}
		}
		scan.close();
		
	}

}
