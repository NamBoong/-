package codeup±‚√ 4;

import java.util.Scanner;

public class Main1257 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int value1=a; value1<=b; value1++) {
			if(value1%2!=0) {
				System.out.printf(value1+" ");
			}
		}
		scan.close();
	}

}
