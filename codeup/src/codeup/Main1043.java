package codeup;

import java.util.Scanner;

public class Main1043 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
	    int value2 = scan.nextInt();
		
	    if(value2 > 0) {
	 
		System.out.println(value1%value2);
		
	    scan.close();
	    }
	}

}
