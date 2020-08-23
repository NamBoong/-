package codeup±‚√ 4;

import java.util.Scanner;

public class Main1253 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a<=b) {
			for(int value1=a; value1<=b; value1++) {
				System.out.printf(value1+" ");
			}
		}
		if(b<a) {
			for(int value2=b; value2<=a; value2++) {
				System.out.printf(value2+" ");
			}
		}
		scan.close();
	}
}
