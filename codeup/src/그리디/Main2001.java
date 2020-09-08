package ±×¸®µð;

import java.util.Scanner;

public class Main2001 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[2];
		int juice = 0;
		
		for(int i=0; i<3; i++) {
			arr1[i] = scan.nextInt();
		}
		
		for(int i=0; i<2; i++) {
			arr2[i] = scan.nextInt();
		}
		
		for(int i=0; i<3; i++) {
			for(int j=i+1; j<3; j++) {
				if(arr1[i]>arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		

		if(arr2[0]>=arr2[1]) {
			juice = arr2[1];
			}
		if(arr2[0]<arr2[1]) {
			juice = arr2[0];
			}
		
		System.out.format("%.1f", (arr1[0] + juice)*1.1);
		
		scan.close();
		
	}
		
}


