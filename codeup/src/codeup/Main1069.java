package codeup;

import java.util.Scanner;

public class Main1069 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.next();
		String value2 = "";
		
		switch(value1) {
		case "A" : value2 = "best!!!";
		break;
		case "B" : value2 = "good!!";
		break;
		case "C" : value2 = "run!";
		break;
		case "D" : value2 = "slowly~";
		break;
		default : value2 = "what?";
		break;
		}
		System.out.println(value2);
		scan.close();
	}

}
