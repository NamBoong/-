package 정을1번수준문제;

import java.util.Scanner;

public class Main4056 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int answer = 0;
		
		if(n<=500) {
			answer = n*70/100;
		}
		
		if(n>500 && n<=1500) {
			answer = 350 + ((n-500)*40/100);
		}
		
		if(n>1500 && n<=4500) {
			answer = 750 + ((n-1500)*15/100);
		}
		
		if(n>4500 && n<=10000) {
			answer = 1200 + ((n-4500)*5/100);
		}
		
		if(n>10000) {
			answer = 1475 + ((n-10000)*2/100);
		}
		
		System.out.println(answer);
		scan.close();
	}

}
