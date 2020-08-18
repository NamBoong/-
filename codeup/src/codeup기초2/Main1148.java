package codeup±âÃÊ2;

import java.util.Scanner;

public class Main1148 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(Integer.valueOf(a>>b));
		scan.close();
	}

}
