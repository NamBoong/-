package codeup±‚√ 5_4;

import java.util.Scanner;

public class Main4501 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[7];
		
		for(int i=0; i<7; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<7; i++) {
			for(int j=i+1; j<7; j++) {
				if(arr[i]<arr[j]) {
				int empt = arr[i];
				arr[i] = arr[j];
				arr[j] = empt;
				}
			}
		}
		
		for(int i=0; i<2; i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
