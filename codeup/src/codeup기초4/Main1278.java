package codeup±‚√ 4;

import java.util.Scanner;

public class Main1278 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 1;
		
		for(count=1; count<=n; count++)
			if(n/(int)Math.pow(10, count)==0) {
				System.out.println(count);
				break;
			}
		scan.close();
		}
	}
