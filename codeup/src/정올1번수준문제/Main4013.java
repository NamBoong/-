package ����1�����ع���;

import java.util.Scanner;

public class Main4013 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.printf(2 + " "+ Integer.toBinaryString(n) + "\n");
		System.out.printf(8 + " " + Integer.toOctalString(n) + "\n");
		System.out.printf("16 %X", n);
		
		scan.close();
	}

}
