package codeup����2;

import java.util.Scanner;

public class Main1161 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if((a+b)%2!=0) {
			if(a%2==0) {
				System.out.println("¦��+Ȧ��=Ȧ��");
			}
			else {
				System.out.println("Ȧ��+¦��=Ȧ��");
			}
		}
		else {
				if(a%2==0 && b%2==0) {
					System.out.println("¦��+¦��=¦��");
				}
				else {
					System.out.println("Ȧ��+Ȧ��=¦��");
				}
			}
		scan.close();
	}
}
