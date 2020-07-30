package codeup;

import java.util.Scanner;

public class Main1010 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Scanner를 사용하면 처음에는 밑에 int 변수까지 지정했는데 왜 안나올까라고 궁금할 것이다.
		//오류에서도 닫아달라고만 나온다...ㅠㅠ
		
		int b = sc.nextInt();
		
		sc.close();
		//그럴땐 위와같이 진짜 닫아주면 그만이다.
		
		System.out.println(b);
		
				
		

	}

}
