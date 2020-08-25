package codeup±‚√ 4;

import java.util.Scanner;

public class Main1280 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int answer1 = 0;
		int answer2 = 0;
		
		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				answer1 = answer1-i;
				System.out.printf("-"+i);
			}
			if(i%2!=0) {
				answer2 = answer2+i;
				System.out.printf("+"+i);
			}
		}
		System.out.printf("=" + (answer1+answer2));
		scan.close();
	}

}
