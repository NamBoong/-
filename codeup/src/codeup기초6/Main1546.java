package codeup±âÃÊ6;

import java.util.Scanner;

public class Main1546 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n>0) {
			System.out.println("plus");
		}
		if(n<0) {
			System.out.println("minus");
		}
		if(n==0) {
			System.out.println("zero");
		}
		scan.close();
	}

}
