package 정올1번수준문제;

import java.util.Scanner;

public class Main4621 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int count = 0;
		
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
				
				if(count==k) {
					System.out.println(i);
				}

			}
		}
		if(count<k) {
			System.out.println(0);
		}
		scan.close();
	}

}
