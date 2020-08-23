package codeup±âÃÊ3;

import java.util.Scanner;

public class Main1222 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int time = scan.nextInt();
		int class1 = scan.nextInt();
		int class2 = scan.nextInt();
		
		while(true) {
			if(time==90) {
				if(class1+1>class2) {
					System.out.printf("win");
					break;
				}
				if(class1+1==class2) {
					System.out.printf("same");
					break;
				}
				if(class1+1<class2) {
					System.out.printf("lose");
					break;
				}
				}
			if(90>time && time%5==0) {
				if((90-time)/5 + class1 > class2) {
					System.out.printf("win");
					break;
				}
				if((90-time)/5 + class1 == class2) {
					System.out.printf("same");
					break;
				}
				if((90-time)/5 + class1 < class2) {
					System.out.printf("lose");
					break;
				}
			}
			if(90>time && time%5!=0) {
				if((90-time)/5 + class1 +1 > class2) {
					System.out.printf("win");
					break;
				}
				if((90-time)/5 + class1 +1 == class2) {
					System.out.printf("same");
					break;
				}
				if((90-time)/5 + class1 +1 < class2) {
					System.out.printf("lose");
					break;
				}
			}
			scan.close();
		}

	}
}
