package 재귀함수;

import java.util.Scanner;

public class Main1930 {

	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();

	public static void answer(int num) {

		
		if(num==n+1) {
			return;
		}
		
		else {
		
			System.out.println("*".repeat(num));
			// 코드업에서 이부분에서 cannot find symbol이라고 뜨며 오류가 난다. 여기에서는 실행시 잘만 나온다ㅠㅠ
			answer(num+1);
			return;
		}
		
	}
	
	public static void main(String[] args) {
		
		answer(1);
	}

}
