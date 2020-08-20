package codeup기초2;

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
			case 0 : answer = "모";
			break;
			case 1 : answer = "도";
			break;
			case 2 : answer = "개";
			break;
			case 3 : answer = "걸";
			break;
			case 4 : answer = "윷";
			break;
			
		}
		System.out.println(answer);
			scan.close();
		}
	}