package codeup;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1030 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		BigInteger value1 = scan.nextBigInteger();
		// 숫자가 커서 처음에는 long 쪽으로 살펴보았고, 그다음으로 big으로 찾아보았다.
		
		System.out.println(value1);
		
		scan.close();
		
	}

}
