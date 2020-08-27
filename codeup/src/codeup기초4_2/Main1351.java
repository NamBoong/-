package codeup±‚√ 4_2;

import java.util.Scanner;

public class Main1351 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i=a; i<=b; i++) {
		for(int j=1; j<=9; j++) {
			System.out.println(i+"*"+j+"="+(i*j));
		}
		}
		scan.close();
	}

}
