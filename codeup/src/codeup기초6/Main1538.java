package codeup±‚√ 6;

import java.util.Scanner;

public class Main1538 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n%2!=0) {
			System.out.println("odd");
		}
		if(n%2==0) {
			System.out.println("even");
		}
		scan.close();
	}

}
