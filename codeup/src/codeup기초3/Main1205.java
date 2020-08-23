package codeup±‚√ 3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1205 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(x+y);
		list.add(x-y);
		list.add(y-x);
		list.add(x*y);
		list.add(x/y);
		list.add(y/x);
		list.add((int) Math.pow(x, y));
		list.add((int) Math.pow(y, x));
		
		Integer i = Collections.max(list);
		
		double j = i;
		System.out.printf("%.6f", j);
		
		scan.close();
	}

}
