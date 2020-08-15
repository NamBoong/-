package codeup;

import java.util.Scanner;

public class Main1082 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String value1 = scan.next();
		
				int value2 = Integer.parseInt(value1, 16);
		
		for(int i=1; i<16; i++) {
			System.out.format("%X*%X=%X%n", value2, i, value2*i);
		}
		scan.close();
	}

}