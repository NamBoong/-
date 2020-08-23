package codeup±‚√ 4;

import java.util.Scanner;

public class Main1260 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int answer = 0;
		
		for(int i=a; i<=b; i++) {
			if(i%3==0) {
				answer = answer + i;
			}
		}
		System.out.println(answer);
		scan.close();
	}

}
