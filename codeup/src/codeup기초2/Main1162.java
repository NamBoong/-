package codeup����2;

import java.util.Scanner;

public class Main1162 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if((a-b+c)%5==0) {
			System.out.println("���");
		}
		else {
			System.out.println("�׷�����");
		}
		scan.close();
	}

}
