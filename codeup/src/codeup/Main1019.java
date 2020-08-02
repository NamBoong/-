package codeup;

import java.util.Scanner;

public class Main1019 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		String value1 = scan.next();
		
		String[] arr = value1.split("\\.");
		
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		System.out.printf("%04d.%02d.%02d",year,month,day);
		//0000.00.00 형식으로 나와야한다고 지시에 적혀있다.
		//month의 경우 1월일 경우 1018번 문제와 같이 "%d"로 코딩할 경우 0000.0.0으로 나오게 되니깐 꼭 몇 개의 숫자로 표현해라라고 지정을해주자.
		
		scan.close();
		
	}

}
