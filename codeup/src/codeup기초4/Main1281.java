package codeup±‚√ 4;

import java.util.Scanner;

public class Main1281 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int answer1 = 0;
		int answer2 = 0;
		
		if(a%2==0) {
			System.out.printf(""+-a);
		}
		if(a%2!=0) {
			System.out.printf(""+a);
		}
		
		for(int i=a+1; i<=b; i++) {
			if(i%2==0) {
				answer1 = answer1 - i;
				System.out.printf("-"+i);
			}
			if(i%2!=0) {
				answer2 = answer2 + i;
				System.out.printf("+"+i);
			}
		}
		if(a%2==0) {
			System.out.printf("="+(-a+answer1+answer2));
		}
		if(a%2!=0) {
			System.out.printf("="+(a+answer1+answer2));
		}
		scan.close();
	}

}
