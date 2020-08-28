package codeup±‚√ 5_2;

import java.util.Scanner;

public class Main1408 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		int[] x = new int[a.length()];
		
		
		for(int i=0; i<a.length(); i++) {
			x[i] = a.charAt(i);			
		System.out.printf((char)(x[i]+2)+"");
		}
		
		System.out.printf("\n");
		
		for(int i=0; i<a.length(); i++) {
			x[i] = a.charAt(i);
		System.out.printf((char)(x[i]*7%80+48)+"");
		}
		scan.close();
	}

}
