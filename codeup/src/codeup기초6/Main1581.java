package codeup기초6;

import java.util.Scanner;

public class Main1581 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.printf(b+" "+a);
		}
		if(a<b) {
			System.out.printf(a+" "+b);
		}
		if(a==b) {
			System.out.println(a+" "+b);
		}
		scan.close();
	}

}
// 문제에서 [를 사용하지말고 풀라는데 	public static void main(String[] args) 이부분에서 []를 안쓸 수 있나싶다.