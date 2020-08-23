package codeup±‚√ 3;

import java.util.Scanner;

public class Main1214 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		int month = scan.nextInt();
		
		String answer1 = "";
		switch(month) {
			case 1 : answer1 = "31";
			break;
			case 3 : answer1 = "31";
			break;
			case 4 : answer1 = "30";
			break;
			case 5 : answer1 = "31";
			break;
			case 6 : answer1 = "30";
			break;
			case 7 : answer1 = "31";
			break;
			case 8 : answer1 = "31";
			break;
			case 9 : answer1 = "30";
			break;
			case 10 : answer1 = "31";
			break;
			case 11 : answer1 = "30";
			break;
			case 12 : answer1 = "31";
			break;
		}
		System.out.printf(answer1);
		
		if((year%400==0 || (year%4==0 && year%100!=0)) && month==2) {
			System.out.println(29);
		}
		if((year%400!=0 && (year%4!=0 || year%100==0)) && month==2) {
			System.out.println(28);
		}
		scan.close();
	}
}
