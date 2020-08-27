package codeup±‚√ 4_2;

import java.util.Scanner;

public class Main1380 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		
		for(int a=1; a<k; a++) {
		if(a<=6 && (k-a)<=6) {
			System.out.printf(a+" "+(k-a)+"\n");
		}
		}
		scan.close();
	}

}
