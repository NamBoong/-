package codeup±‚√ 4;

import java.util.Scanner;

public class Main1276 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int answer = 1;
		
		for(int a=1; a<=n; a++) {
			answer = answer * a;
		}
		System.out.println(answer);
		scan.close();
	}

}
