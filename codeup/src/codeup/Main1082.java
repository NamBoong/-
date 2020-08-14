package codeup;

import java.util.Scanner;

public class Main1082 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.next();
		
		for(int v=1; v<=16; v++) {
			//a는 둘의 곱셈 결과

			int a = v;
			int b = Integer.valueOf(a);
			String c = Integer.toHexString(b);
			System.out.println(value1 + "*" + stringToHex(v) + "=" + c );
		}
		
		scan.close();
	}

	private static int stringToHex(int v) {
		// TODO Auto-generated method stub
		return 0;
	}

}
// 현재 16진수로 곱셈을 못받고 있다. 진수 변경만 되면 될 것 같다.
