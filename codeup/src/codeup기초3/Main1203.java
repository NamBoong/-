package codeup����3;

import java.util.Scanner;

public class Main1203 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a<=10) {
			System.out.println("����");
		}
		if(a<=20 && a>10) {
			System.out.println("��ü��");
		}
		if(a>20) {
			System.out.println("��");
		}
		scan.close();
		}

}
