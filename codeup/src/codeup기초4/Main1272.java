package codeup±‚√ 4;

import java.util.Scanner;

public class Main1272 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int h = scan.nextInt();
		int k_answer1 = 0;
		double k_answer2 = 0;
		int h_answer1 = 0;
		double h_answer2 = 0;
		
		if(k%2==0) {
			k_answer1 = k/2*10;
		}
		if(k%2!=0) {
			k_answer2 = k-Math.floor(k/2);
		}
		
		if(h%2==0) {
			h_answer1 = h/2*10;
		}
		if(h%2!=0) {
			h_answer2 = h-Math.floor(h/2);
		}
		
		System.out.printf("%.0f", k_answer1+k_answer2+h_answer1+h_answer2);
		scan.close();
	}

}
