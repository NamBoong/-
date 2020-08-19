package codeup±âÃÊ2;

import java.util.Scanner;

public class Main1173 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(b>=30) {
			System.out.println(a+" "+(b-30));
		}
		if(a==0 && b<30) {
			System.out.println(23+" "+(b+60-30));
		}
		if(a!=0 && b<30) {
			System.out.println((a-1)+" "+(b+60-30));
		}
			
		scan.close();
	}

}
