package codeup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1094 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		//이게 변수가 들어갈 공간을 만들어주는 거라고한다.
		
		for(int i=0; i<value1; i++) {
			int value2 = scan.nextInt();
			list.add(value2);
		}
		Collections.reverse(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf(list.get(i) + " ");
		}
		scan.close();
	}

}
