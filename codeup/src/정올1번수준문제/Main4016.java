package 정올1번수준문제;

import java.util.Scanner;

public class Main4016 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int answer = 0;
		
		for(int i=1; i<=Math.max(Math.max(a, b),c); i++) {
			if(a%i==0 && b%i==0 && c%i==0) {
				answer = i;
			}
		}
		
		System.out.println(answer);
		scan.close();
	}

}
