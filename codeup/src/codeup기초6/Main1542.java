package codeup±‚√ 6;

import java.util.Scanner;

public class Main1542 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 0;
		
		for(int i=2; i<=n; i++) {
			if(n%i==0) {
				count ++;
			}
		}
		
		if(count==1) {
			System.out.println("prime");
		}
		else {
			System.out.println("composite");
		}
		scan.close();
		
	}

}
