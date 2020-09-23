package 쉬워보이지만한번에맞히기어려운문제;

import java.math.BigInteger;
import java.util.Scanner;

public class Main3023 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		
		System.out.println(a.multiply(b));
		
		scan.close();
	}

}
