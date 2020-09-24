package 탐색기반설계;

import java.util.Scanner;

public class Main2650 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int min = Math.min(Math.min(a, b), c);
		
		for(int i=min; i>=1; i--) {
			if(a%i==0 && b%i==0 && c%i==0) {
				System.out.println(i);
				break;
			}
		}
		
		scan.close();
		
	}

}
