package 정올1번수준문제;

import java.util.Scanner;

public class Main4566 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int count = 0;
		int down = m;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		while(down<=n) {
			for(int i=2; i<=down; i++) {
				if(down%i==0) {
					count++;
				}
				
				if(down==i && count==1) {
					sum = sum + down;
					count = 0;
					if(min>down) {
						min = down;
					}
					break;
					
				}
			}
			count=0;
			down++;
		}
		
		System.out.println(sum);
		System.out.println(min);
		scan.close();
	}

}
