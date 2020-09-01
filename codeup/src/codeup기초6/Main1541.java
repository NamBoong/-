package codeup±‚√ 6;

import java.util.Scanner;

public class Main1541 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n<0) {
			System.out.println("negative");
		}
		if(n==0) {
			System.out.println("zero");
		}
		if(n>0) {
			System.out.println("positive");
		}
		scan.close();
	}

}
