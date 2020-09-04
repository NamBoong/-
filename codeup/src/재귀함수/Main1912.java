package Àç±ÍÇÔ¼ö;

import java.util.Scanner;

public class Main1912 {

	static int result = 1;
	
	public static void answer(int num) {

		
		if(num==0) {
			System.out.println(result);
			return;
		}
		
		else {
			result = result * num;
			answer(num-1);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}

}
