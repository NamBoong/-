package codeup±‚√ 4;

import java.util.Scanner;

public class Main1294 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		
		while(true) {
			for(int i=0; i<a.length(); i++) {
				if(a.charAt(i)>=97 && a.charAt(i)<=119) {
					System.out.printf((char)(a.charAt(i)+3)+"");
				}
				if(a.charAt(i)==32) {
					System.out.printf((char)a.charAt(i)+"");
				}
				if(a.charAt(i)>=120 && a.charAt(i)<=122) {
					System.out.printf((char)(a.charAt(i)-23)+"");
				}
			}
			break;
		}
		scan.close();
	}

}
