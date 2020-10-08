package codeup√÷±Ÿ100¡¶;

import java.util.Scanner;

public class Main4081 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n<1 || n>1000) {
			System.out.println(n + " data error");
		}
		
		if(n>=1 && n<74) {
			System.out.println(n + " blue recommend");
		}
		
		if(n>=74 && n<100) {
			System.out.println(n + " green possible");
		}
		
		if(n>=100 && n<148) {
			System.out.println(n + " yellow careful");
		}
		
		if(n>=148 && n<=1000) {
			System.out.println(n + " red stop");
		}
		
		scan.close();
	}

}
