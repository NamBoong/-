package codeup±‚√ 5_2;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1990 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		BigInteger a = scan.nextBigInteger();
		
		if(a.remainder(BigInteger.valueOf(3)) != BigInteger.valueOf(0)) {
			System.out.println(0);
		}
		if(a.remainder(BigInteger.valueOf(3)) == BigInteger.valueOf(0)) {
			System.out.println(1);
		}
		scan.close();
	}

}
