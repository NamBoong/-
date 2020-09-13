package 관리자추천문제;

import java.util.Scanner;

public class Main2009 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int n = scan.nextInt();
		int plus = 0;
		
		while(true) {
			if(k>=n) {
				k = k-n + 1;
				plus++;
			}
			if(k<n) {
				System.out.println(plus);
				break;
			}
		}
	scan.close();
	}

}
