package codeup±‚√ 4;

import java.util.Scanner;

public class Main1273 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = 1;
		
		for(a=1; a<=n; a++) {
			if(n%a==0) {
				System.out.printf(a+" ");
			}
		}
		scan.close();
	}
}
