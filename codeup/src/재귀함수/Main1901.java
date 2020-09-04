package 재귀함수;

import java.util.Scanner;

public class Main1901 {
	
	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();
	// 전역변수 n을 설정해주자.
	
	
	public static void main(String[] args) {

		answer(1);
	// 먼저 1을 넣자.
	}
	
	public static void answer(int num) {
		
		if(num==n+1) {
			return;
		//n+1이 되면 멈춰달라고하자. 즉 5까지 출력되어야하면 6이 나와야한다.
		}
		
		else {
			System.out.println(num);
			
			answer(num+1);
			// num 출력을 하고 answer를 num+1한 값으로 바꿔준다.
		}
		
	}
	

}
