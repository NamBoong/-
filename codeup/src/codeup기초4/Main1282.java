package codeup기초4;

import java.util.Scanner;

public class Main1282 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 1;
		int answer = 0;
		
		for(count=1; count<n; count++) {
			if(Math.pow(count, 2)<=n) {
				answer = count;
			}
		}
		System.out.printf((n-(int) Math.pow(answer, 2)) + " " + answer);
		scan.close();
	}

}
// 답이 바로 나오나 코드업에선 시간초과로 뜬다. 조언에도 for문을 하나만 이용하라고 하나만 이루어져있는데 왜 오래걸리는지 모르겠다.