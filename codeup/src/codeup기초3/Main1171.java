package codeup±âÃÊ3;

import java.util.Scanner;

public class Main1171 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(c>=100) { 
			if(b>=10) {
			System.out.println(a+""+b+""+c);
			}
			if(b<10) {
				System.out.println(a+"0"+b+""+c);
			}
		}
		if(10<=c && c<100) {
			if(b>=10) {
				System.out.println(a+""+b+"0"+c);
				}
				if(b<10) {
					System.out.println(a+"0"+b+"0"+c);
				}
		}
		if(10>c) {
			if(b>=10) {
				System.out.println(a+""+b+"00"+c);
				}
				if(b<10) {
					System.out.println(a+"0"+b+"00"+c);
				}
		}
		scan.close();
	}

}