package codeup±âÃÊ5_2;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1754 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		
		if(a.compareTo(b)>0) {
			System.out.printf(b+" "+a);
		}
		if(a.compareTo(b)<0) {
			System.out.printf(a+" "+b);
		}
		scan.close();
	}

}
