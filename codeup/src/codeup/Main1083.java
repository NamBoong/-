package codeup;

import java.util.Scanner;

public class Main1083 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		for(int i=1; i<=value1; i++) {
			if(i%3==0) {
				System.out.printf("X"+" ");
			}
			else{
				System.out.printf(i+" ");
			}
		}
	}

}
