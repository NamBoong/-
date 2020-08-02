package codeup;

import java.util.Scanner;

public class Main1020 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.next();
		
		String[] Arr = value1.split("-");
		
		int front = Integer.valueOf(Arr[0]);
		int back = Integer.valueOf(Arr[1]);
		
		System.out.printf("%06d"+"%07d", front, back);
		
		scan.close();
		
		
	}

}
