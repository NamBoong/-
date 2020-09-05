package Àç±ÍÇÔ¼ö;

import java.util.Scanner;

public class Main1928 {
	
	public static void answer(int num) {
			
		if(num%2==1 && num!=1) {
			System.out.println(3*num+1);
			answer(3*num+1);
			return;
		}
		
		if(num%2==0) {
			System.out.println(num/2);
			answer(num/2);
			return;
		}
		
		if(num==1) {
			return;
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(n);
		
		answer(n);
		
		scan.close();
	}

}
