package 정올1번수준문제;

import java.util.Scanner;

public class Main4571 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(Math.pow(i, 2)>=m && Math.pow(i, 2)<=n) {
				sum = (int) (sum + Math.pow(i, 2));			
			}
		}
		System.out.println(sum);
		
		for(int i=1; i<=100; i++) {
			if(Math.pow(i, 2)>=m && Math.pow(i, 2)<=n) {
				System.out.println((int)Math.pow(i, 2));
				break;
			}
		}
		scan.close();
	}

}
