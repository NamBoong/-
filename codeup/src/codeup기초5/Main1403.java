package codeup±‚√ 5;

import java.util.Scanner;

public class Main1403 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int[] arr = new int[k];
		
		for(int i=0; i<k; i++) {
			arr[i] = scan.nextInt();
			
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<k; i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
