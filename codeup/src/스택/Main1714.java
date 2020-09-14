package ½ºÅÃ;

import java.util.Scanner;

public class Main1714 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		String[] m = n.split("");
		
		for(int i=n.length()-1; i>=0; i--) {
			System.out.printf(m[i]);
		}
		scan.close();
	}

}
