package codeup±‚√ 2;

import java.util.Scanner;

public class Main1170 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(c<10) {
			System.out.println(a+""+b+""+"0"+c);
		}
		else {
			System.out.println(a+""+""+b+""+c);
		}
		
		scan.close();
	}

}