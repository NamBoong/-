package codeup;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Main1027 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		String pattern = "^[0-9]*.[0-9]*.[0-9]*$";
		// 년.월.일 로 형식을 준다고했으니 다음과같은 패턴으로 입력될거라고 알려주자
		
		String value1 = scan.nextLine();
		//value1은 외부에서 입력되는 값을 받는 변수

		scan.close();
		
		if(Pattern.matches(pattern, value1)) {
			//우리가 적은 패턴과 외부에서 입력한 값value1 변수랑 일치하는지 확인시키고
			String[] value2 = value1.split("\\.");
			//이제 외부에서 온 value1 값을 찢을 value2를 만들어준다.
		
			int year = Integer.parseInt(value2[0]);
			int month = Integer.parseInt(value2[1]);
			int day = Integer.parseInt(value2[2]);
			
			System.out.printf("%02d-%02d-%04d", day, month, year);
			
			}
		}
		
	}


