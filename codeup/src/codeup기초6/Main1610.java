package codeup±‚√ 6;

import java.util.Scanner;

public class Main1610 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String n = scan.nextLine();
		
		String[] n2 = n.split("");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
	
		for(int i=a; i<a+b; i++) {
			System.out.printf(n2[i]);
		}
		scan.close();
	}

}
