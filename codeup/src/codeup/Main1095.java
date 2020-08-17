package codeup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1095 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<value1; i++) {
			int value2 = scan.nextInt();
			list.add(value2);
		}
		System.out.println(Collections.min(list));
		scan.close();
	}

}
