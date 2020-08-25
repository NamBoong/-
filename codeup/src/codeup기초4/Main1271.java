package codeup기초4;

import java.util.Scanner;

public class Main1271 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		int max = 0;
		int b = 1;
		int c = 2;
		
		for(int i=0; i<=n; i++) {
			arr[i] = scan.nextInt();
		for(b=1; b<i; b++) {
		for(c=2; c<i; c++) {
			if(arr[i]>max) {
				max = arr[i];
				System.out.println(max);
			}
		}
		}
		}
		scan.close();
	}
}
// 구동했을때 몇 가지 케이스를 가지고 해봤으나 문제가 나오지않았다. 그러나 코드업에서는 컴파일 에러로 계속해서 떠서 문제를 넘기기로 했다...ㅠㅠ