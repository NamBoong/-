package codeup;

import java.util.Scanner;

public class Main1073 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// 값이 true인 동안만 작동한다로 시작한다.
			int value1 = scan.nextInt();
			// value1의 값을 스캔하는 것으로.
			if(value1==0) {
				break;
				// value1의 값이 0이 되는 순간 멈춰주자.
			}
			System.out.println(value1);
			// 그리고 멈춰진 값(0을 빼고 그전까지만 나올것이다) 그것을 출력시킨다.
		}
		scan.close();
   }
}
// 답이 안나와서 구글에 쳐보며 답을 찾았는데 너무나도 간단한 답안에 허탈하다....ㅠㅠ