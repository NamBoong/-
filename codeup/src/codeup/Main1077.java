package codeup;

import java.util.Scanner;

public class Main1077 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int answer1 = 0;
	
		while(true) {
			int answer2 = answer1++;
			if(answer2>value1) {
				break;
			}
			System.out.println(answer2);
		}
		scan.close();
		}
}