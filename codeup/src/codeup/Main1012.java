// 시작하기 앞서서 소숫점 6자리만 나오길 원하는 문제이다. (와! 진작에 말해주지!)

package codeup;

import java.util.Scanner;

public class Main1012 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		// 3번째해보니 이제 외울 수도 있을 것 같다.
		
		Double value1 = scan.nextDouble();
		// float와 Double이 무슨 차이인지 아직 나는 정확하게 구별은 못하지만 Double로 해줘야한다.
		// float는 뒤에 2.157765F를 써줘야한다는 것만 알고있기에 우리는 숫자만 원하니 Double을 쓰자.
		
		scan.close();
		
		System.out.println(String.format("%.6f", value1));
		// 여기가 고비였다. sout(문자.포멧해달라("%.6번째 소숫점까지", 변수명)); 이렇게 해석했다.
		// 왜 Math.round()를 안했는가는 다음과 같은 차이가 있다.
		// 아래의 내용을 실험해보면 알 수 있다.
		
		// Double x = (double) 10000;
		// System.out.println(Math.round((x*100)/100.0));
		// System.out.println(String.format("%.3f", x));
		
		// 위와 같이 입력하고 출력해보면 Math.round는 딱 나누어 떨어질 경우엔 소숫점을 굳이 쓰지않는다.
		// String.format은 진득하게 내려준 명령("%.원하는 소숫점 자리수f")까지 다 써준다.
		
	}

}
