package codeup±‚√ 2;

import java.util.Scanner;

public class Main1157 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Double a = scan.nextDouble();
		
		if(50<=a) {
			if(a<=60)
			System.out.printf("win");
		else {
			System.out.printf("lose");
		}
		}
		else {
			System.out.println("lose");
		}
		scan.close();
	}

}
