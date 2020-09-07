package 정을1번수준문제;

import java.util.Scanner;

public class Main4506 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int answer = 0;
				
		for(int i=1; i<=Math.min(a, b); i++) {
			if(a%i==0 && b%i==0) {
				answer = i;
			}
		}
		System.out.println(answer);
		
		for(int i=Math.min(a, b); i<=100000000; i++) {
			if(i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}
		scan.close();
	}

}
