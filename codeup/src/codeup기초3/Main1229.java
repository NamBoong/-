package codeup기초3;

import java.util.Scanner;

public class Main1229 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double height = scan.nextDouble();
		double weight = scan.nextDouble();
		
		if(height<150) {
			double kg1 = height-100;		
			double bmi1 = (weight-kg1)*100/kg1;
			if(bmi1<=10) {
				System.out.println("정상");
			}
			if(10<bmi1 && bmi1<=20) {
				System.out.println("과체중");
			}
			if(20<bmi1) {
				System.out.println("비만");
			}
		}
		if(150<=height && height<160) {
			double kg2 = (height-150)/2+50;
			double bmi2 = (weight-kg2)*100/kg2;
			if(bmi2<=10) {
				System.out.println("정상");
			}
			if(10<bmi2 && bmi2<=20) {
				System.out.println("과체중");
			}
			if(20<bmi2) {
				System.out.println("비만");
			}
		}
		if(160<=height) {
			double kg3 = (height-100)*0.9;
			double bmi3 = (weight-kg3)*100/kg3;
			if(bmi3<=10) {
				System.out.println("정상");
			}
			if(10<bmi3 && bmi3<=20) {
				System.out.println("과체중");
			}
			if(20<bmi3) {
				System.out.println("비만");
			}
		scan.close();
		}
	}
}
