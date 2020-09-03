package codeup±âÃÊ6;

import java.util.Scanner;

public class Main1558 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String n = scan.nextLine();
		String[] arr = n.split("");
		
		for(int i=n.length()-1; i>=0; i--) {
			System.out.printf(arr[i]+"");
		}
		scan.close();
	}

}
