package codeup;

import java.util.Scanner;

public class Main1079 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			char value1 = scan.next().charAt(0);
			// charAt �μ��� 0��° ���ڸ� �д´�.
			if(value1=='q') {
				System.out.println("q");
				break;
			}
			System.out.println(value1);
		}
		scan.close();
	}

}
