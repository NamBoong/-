package codeup기초2;

import java.util.Scanner;

public class Main1228 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double hight = scan.nextDouble();
		double weight = scan.nextDouble();
		
		double kg = (hight-100)*0.9;
		double bmi = (weight-kg)*100/kg;
		
		if(bmi<=10) {
			System.out.println("정상");
		}
		if(10<bmi && bmi<=20) {
			System.out.println("과체중");
		}
		if(20<bmi) {
			System.out.println("비만");
		}
		scan.close();
	}
}
