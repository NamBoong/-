package codeup±‚√ 3;

import java.util.Scanner;

public class Main1206 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		while(true) {
			if(b%a==0) {
				System.out.println(a+"*"+(b/a)+"="+b);
				break;
			}
			if(a%b==0) {
				System.out.println(b+"*"+(a/b)+"="+a);
				break;
			}
			if(a%b!=0 && b%a!=0) {
				System.out.println("none");
				break;
			}
		}
		scan.close();
		}

}
