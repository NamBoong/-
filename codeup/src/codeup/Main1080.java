package codeup;

import java.util.Scanner;

public class Main1080 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int i = 0;
		
		while(true) {
			int sum = i++;
			if(sum>=value1) {
				System.out.println(sum);
				break;
			}

		}

		scan.close();
	}
}

// 아직 푸는중