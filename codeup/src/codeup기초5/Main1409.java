package codeup±‚√ 5;

import java.util.Scanner;

public class Main1409 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for(int i=0; i<10; i++) {
			a[i] = scan.nextInt();
		}
		
		int k = scan.nextInt();
		
		System.out.println(a[k-1]);
		scan.close();
	}

}
