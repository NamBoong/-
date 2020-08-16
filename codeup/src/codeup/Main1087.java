package codeup;

import java.util.Scanner;

public class Main1087 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<=a; i++) {
			sum += i;
			if(sum>=a) {
				break;
			}
			}
		System.out.println(sum);
		
		scan.close();
	}

}
// 오늘도 한 건 했다. 다 풀어놓고서는 왜 10을 넣었는데 55가 아니라 15가 나오지로 한참을 고민했다.