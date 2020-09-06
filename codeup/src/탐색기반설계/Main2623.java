package 탐색기반설계;

import java.util.Scanner;

public class Main2623 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int answer = 0;
		
		
		if(a>=b) {
			for(int i=1; i<=a; i++) {
				if(a%i==0 && b%i==0) {
					answer = i;
				}
			}		
		}
		
		if(b>a) {
			for(int i=1; i<=b; i++) {
				if(a%i==0 && b%i==0) {
					answer = i;
				}
			}		
		}
		
		System.out.println(answer);

		scan.close();
		
	}

}
