package codeup;

import java.util.Scanner;

public class Main1070 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		String answer1 = "";
		
		switch(value1){
		// 이번 문제의 변수는 10 11 12가 '11'로 쓰면 문자로 인식한다는 점과, case 12, 1, 2라고 쓰고 돌리면 잘 되는데 코드업에선 에러로 뜨는점이였다.
		// 한줄에 한 개씩, 단 케이스에 상응하는 반응이 같다면 마지막에 몰아주면 된다.
			case 12 :
			case 1 :
			case 2 : answer1 = "winter";
			break;
			case 3 :
			case 4 :
			case 5 : answer1 = "spring";
			break;
			case 6 :
			case 7 :
			case 8 : answer1 = "summer";
			break;
			case 9 :
			case 10 :
			case 11 : answer1 = "fall";
			break;			
		}
		System.out.println(answer1);
		scan.close();
	}

}
