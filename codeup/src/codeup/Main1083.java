package codeup;

import java.util.Scanner;

public class Main1083 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		for(int i=1; i<=value1; i++) {
			if(i%3==0) {
				System.out.printf("X"+" ");
				// 띄어쓰기를 하고싶을땐 공백을 추가해서 줄바꿈이 없게 만들어주자.
			}
			else{
				System.out.printf(i+" ");
			}
		}
	}

}
