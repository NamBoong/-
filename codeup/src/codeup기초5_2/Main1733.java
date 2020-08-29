package codeup±‚√ 5_2;

import java.util.Scanner;

public class Main1733 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		
		if(a.matches("IOI")) {
			System.out.println("IOI is the International Olympiad in Informatics.");
		}
		else {
			System.out.println("I don't care.");
		}
		scan.close();
	}

}
