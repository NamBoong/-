package codeup±‚√ 6;

import java.util.Scanner;

public class Main1564 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int answer = 0;
		
		for(int i=1; i<=100000; i++) {
			if(a%i==0 && b%i==0) {
				answer = i;
			}
		}
		System.out.println(answer);
		scan.close();
	}

}
