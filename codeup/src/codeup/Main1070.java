package codeup;

import java.util.Scanner;

public class Main1070 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		String answer1 = "";
		
		switch(value1){
		// �̹� ������ ������ 10 11 12�� '11'�� ���� ���ڷ� �ν��Ѵٴ� ����, case 12, 1, 2��� ���� ������ �� �Ǵµ� �ڵ������ ������ �ߴ����̿���.
		// ���ٿ� �� ����, �� ���̽��� �����ϴ� ������ ���ٸ� �������� �����ָ� �ȴ�.
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
