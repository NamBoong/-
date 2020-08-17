package codeup;

import java.util.Scanner;

public class Main1093 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int[] arr = new int[24];
		
		for(int i=0; i<value1; i++) {
			int value2 = scan.nextInt();
			arr[value2-1] += 1;
		}
		for(int i=0; i<23; i++) {
			System.out.printf(arr[i] + " ");
		}
		
	}

}
