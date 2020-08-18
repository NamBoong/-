package codeup±‚√ 2;

import java.util.Scanner;

public class Main1158 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Double a = scan.nextDouble();
		
		if((30<=a && a<=40)||(60<=a && a<=70)) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
		scan.close();
	}

}
