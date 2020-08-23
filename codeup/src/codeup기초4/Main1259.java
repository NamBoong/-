package codeup±‚√ 4;

import java.util.Scanner;

public class Main1259 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int b = 0;
		
			for(int a=0; a<=n; a++) {
			if(a%2==0) {
				b = b+a;
			}
		}
			System.out.println(b);
			scan.close();
	}
}