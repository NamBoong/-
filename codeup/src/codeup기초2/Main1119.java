package codeup기초2;

import java.util.Scanner;

public class Main1119 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		// 왜인진 모르겠지만 int로 받으니 에러가 뜬다. long으로 해주자.
		System.out.println(a*24);
		scan.close();
	}

}
