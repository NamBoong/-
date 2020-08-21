package codeup±âÃÊ2;

import java.util.Scanner;

public class Main1216 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if((b-c)>a) {
			System.out.println("advertise");
		}
		if((b-c)<a) {
			System.out.println("do not advertise");
		}
		if((b-c)==a) {
			System.out.println("does not matter");
		}
		scan.close();
	}

}
