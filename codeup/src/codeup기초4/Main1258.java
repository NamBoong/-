package codeup±‚√ 4;

import java.util.Scanner;

public class Main1258 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int a=1; a<=n; a++) {
			int b = a*(a+1)/2;
			if(a>=n) {
				System.out.println(b);
				break;
			}
	}
		scan.close();
	}

}
