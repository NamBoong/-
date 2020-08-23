package codeup±‚√ 3;

import java.util.Scanner;

public class Main1168 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
				
		if(b==1 || b==2) {
			System.out.format("%.0f", 2012-(1900+Math.floor(a/10000))+1);
		}
		else {
			System.out.format("%.0f", 2012-(2000+Math.floor(a/10000))+1);
		}
		scan.close();
	}

}
