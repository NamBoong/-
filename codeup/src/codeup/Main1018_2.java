package codeup;

import java.util.Scanner;

public class Main1018_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.next();
		
		String[] arr = value1.split(":");
		// 문자를 []로 숫자를 매겨서 지금부터 배열을 하겠다는 의미이다. value1에 들어오는 내용을 분리하는 기준은 :로 삼는다.
		
		
		int hour = Integer.valueOf(arr[0]);
		int min = Integer.valueOf(arr[1]);
		// 문자string을 이제 int정수로 hour과 min을 받을것이다. 시간 : 분 으로 총 2개를 받아야하니깐 arr[0]부터 arr[1]까지이다.
		
		System.out.printf("%d:%d", hour, min);
		// 받을 배열을arr[0~x]를 다음과 같은 형식으로 나타내달라고하는거다. 그 뒤에 정해진 형식에 넣을 배열명을 넣어준다.	
		
		scan.close();

	}

}
