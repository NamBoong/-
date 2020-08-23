package codeup±‚√ 4;

import java.util.Scanner;

public class Main1254 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char a = scan.next().charAt(0);
		char b = scan.next().charAt(0);
		
		
		for(int value1=a; value1<=b; value1++) {
			System.out.printf((char)value1+" ");
		}
		scan.close();
	}

}
