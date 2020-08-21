package codeup±âÃÊ2;

import java.util.Scanner;

public class Main1210 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		String answer1 = "";
		switch(x) {
			case 1 : answer1 = "400";
			break;
			case 2 : answer1 = "340";
			break;
			case 3 : answer1 = "170";
			break;
			case 4 : answer1 = "100";
			break;
			case 5 : answer1 = "70";
			break;
		}
		int a = Integer.valueOf(answer1);
		
		String answer2 = "";
		switch(y) {
			case 1 : answer2 = "400";
			break;
			case 2 : answer2 = "340";
			break;
			case 3 : answer2 = "170";
			break;
			case 4 : answer2 = "100";
			break;
			case 5 : answer2 = "70";
			break;
		}
		int b = Integer.valueOf(answer2);
		
		if(a+b>500) {
			System.out.println("angry");
		}
		else {
			System.out.println("no angry");
		}
		scan.close();
	}
}
