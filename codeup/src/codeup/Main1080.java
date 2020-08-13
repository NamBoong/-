package codeup;

import java.util.Scanner;

public class Main1080 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int i = 0;
		
		for(int b=0; i<value1; b++) {
			i = i+b;
			if(i>=value1) {
				System.out.println(b);
				break;
			}
		}
		scan.close();
	}
}
			