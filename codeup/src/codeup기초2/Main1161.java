package codeup±âÃÊ2;

import java.util.Scanner;

public class Main1161 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if((a+b)%2!=0) {
			if(a%2==0) {
				System.out.println("Â¦¼ö+È¦¼ö=È¦¼ö");
			}
			else {
				System.out.println("È¦¼ö+Â¦¼ö=È¦¼ö");
			}
		}
		else {
				if(a%2==0 && b%2==0) {
					System.out.println("Â¦¼ö+Â¦¼ö=Â¦¼ö");
				}
				else {
					System.out.println("È¦¼ö+È¦¼ö=Â¦¼ö");
				}
			}
		scan.close();
	}
}
