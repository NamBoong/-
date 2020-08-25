package codeup±‚√ 4;

import java.util.Scanner;

public class Main1274 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int b=2; b<=a; b++) {
			if(a%b==0) {
			if(b==a) {
				System.out.println("prime");
				break;
			}
			else if(b!=a) {
				System.out.println("not prime");
				break;
			}
			}
		}
		scan.close();
	}
}
