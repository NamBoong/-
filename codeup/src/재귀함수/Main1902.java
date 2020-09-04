package 재귀함수;

import java.util.Scanner;

public class Main1902 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
		
		//먼저 스캔으로 숫자n을 받고 answer 함수에 n 값을 대입시키는걸로 한다.
	}
	
	public static void answer(int num) {
	// 여기세어 n는 num이 되었다.
		if(num==0) {
			return;
			//0이 되면 스탑시켜주게 return을 해주자.
		}
		
		else {
			System.out.println(num);
			answer(num-1);
			//num을 먼저 출력하고 num-1을 한 값을 다시 위에 public static void answer로 보낸다.
			//그럼 다음 거는 answer(n-1)이다.
		}
	}
}
// 그래서 정순은 어떻게 출력해야할까?
