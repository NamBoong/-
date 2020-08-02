package codeup;

import java.util.Scanner;

public class Main1015 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		float value1 = scan.nextFloat();
		// 정수 1개를 반올림 하기에 double이 아니라 이번엔 float로 받고, next뒤는 같은 유형인 float으로 받는다.
		
		System.out.printf(String.format("%.2f",value1));
		//system.out.print''''ln''''이 아니다!!! f로 출력하자. 소숫점 3번째자리에서 2번째까지만 있으면 좋겠다고하니, 살아남기를 원하는 자리까지 써주고 "%.2f" 뒤에 f를 붙여주자.
		//참고로 .이 없으면 소숫점에서 반올림안하니깐 꼭 붙이자.
		
		scan.close();
				
		
	}

}
