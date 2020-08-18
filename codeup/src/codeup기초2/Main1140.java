package codeup±‚√ 2;

import java.util.Scanner;

public class Main1140 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a==1 || b==1) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		scan.close();
	}

}
