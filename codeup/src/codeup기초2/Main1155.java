package codeup±‚√ 2;

import java.util.Scanner;

public class Main1155 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a%7==0) {
			System.out.println("multiple");
		}
		else {
			System.out.println("not multiple");
		}
		scan.close();
	}

}
