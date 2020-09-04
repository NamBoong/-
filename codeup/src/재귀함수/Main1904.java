package Àç±ÍÇÔ¼ö;

import java.util.Scanner;

public class Main1904 {

	static Scanner scan = new Scanner(System.in);

	static int a = scan.nextInt();
	static int b = scan.nextInt();
	
	public static void main(String[] args) {
		
		answer(a);
	}
	
	public static void answer(int x) {
		
		if(x==b+1) {
				return;
		}
		else {
			if(x%2==1) {
				System.out.println(x);
			}
			
			answer(x+1);
		}
	}

}
