package codeup±‚√ 4;

import java.util.Scanner;

public class Main1270 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int count=0;
		
		for(int i=1; i<=a; i++) {
			if(i%10==1) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}
}
