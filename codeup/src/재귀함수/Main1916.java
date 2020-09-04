package Àç±ÍÇÔ¼ö;

import java.util.Scanner;

public class Main1916 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(answer(n)%10009);
		
		scan.close();
	}
	
	public static int answer(int num) {
		
		if(num==1) {
			return 1;
		}
		if(num==2) {
			return 1;
		}
		
		else {
			return answer(num-2) + answer(num-1);
		}
	}

}
