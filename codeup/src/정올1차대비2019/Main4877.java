package 정올1차대비2019;

import java.util.Scanner;

public class Main4877 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int n = scan.nextInt();
		
		int answer = 0;
		
		for(int i=n/c; i>=0; i--) {
			for(int j=0; j<=n/b; j++) {
				for(int k=0; k<=n/a; k++) {
					if(c*i + b*j + a*k == n) {
						answer = 1;
					}
				}
		}
		}
		
		System.out.println(answer);
		scan.close();
	}

}
