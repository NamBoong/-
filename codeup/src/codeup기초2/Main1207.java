package codeup����2;

import java.util.Scanner;

public class Main1207 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		String answer = "";
		switch(a+b+c+d){
			case 0 : answer = "��";
			break;
			case 1 : answer = "��";
			break;
			case 2 : answer = "��";
			break;
			case 3 : answer = "��";
			break;
			case 4 : answer = "��";
			break;
			
		}
		System.out.println(answer);
			scan.close();
		}
	}