package codeup±‚√ 6;

import java.util.Scanner;

public class Main1556 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long answer = 1;
		
		for(int i=1; i<=n; i++) {
			answer = answer*i;
		}
		System.out.println(answer);
		scan.close();
	}

}
