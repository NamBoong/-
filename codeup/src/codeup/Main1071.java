package codeup;

import java.util.Scanner;

public class Main1071 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1;
		while(true) {
			value1 = scan.nextInt();
			
			if(value1==0)
				break;
			// 0이 나왔을때 멈추고 거기까지 스캔하라고 되어있다.
				System.out.println(value1);
		}

		scan.close();
	}
}
