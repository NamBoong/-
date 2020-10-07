package codeup√÷±Ÿ100¡¶;

import java.util.Scanner;

public class Main1721 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		double answer = Math.sqrt(Math.abs(Math.pow((x2-x1), 2)) + Math.abs(Math.pow((y2-y1), 2)));
		
		System.out.printf("%.2f", answer);
		
		scan.close();
	}

}
