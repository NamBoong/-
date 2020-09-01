package codeup±‚√ 6;

import java.util.Scanner;

public class Main1555 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long answer = 0;
		
		for(long i=1; i<=n; i++) {
			answer = answer + i;
		}
		
		System.out.println(answer);
		scan.close();
	}

}