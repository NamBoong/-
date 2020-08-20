package codeup±‚√ 2;

import java.util.Scanner;

public class Main1204 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		while(true){
			if(a==11 || a==12 || a==13) {
				System.out.println(a+"th");
				break;
			}
			if(a%10==1) {
				System.out.println(a+"st");
				break;
			}
			if(a%10==2) {
				System.out.println(a+"nd");
				break;
			}
			if(a%10==3) {
				System.out.println(a+"rd");
				break;
			}
		else {
			System.out.println(a+"th");
			break;
		}
		}
		scan.close();
	}
}
