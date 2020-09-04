package Àç±ÍÇÔ¼ö;

import java.util.Scanner;

public class Main1915 {	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		System.out.println(result(n));
		scan.close();
	}
	
	
	public static int result(int num) {
		
		if(num==1) {
			return 1;
		}
		
		else if(num==2) {
			return 1;
		}
		
		else {
			return result(num-1) + result(num-2);
			
		}
		
		
	}
	


}
