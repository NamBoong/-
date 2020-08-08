package codeup;

import java.util.Scanner;

public class Main1053 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		if(value1==0) {
			System.out.println(1);
			//value1 변수가 0과 같으면 1이 출력되게 if문 작성
		}
		if(value1==1){
			System.out.println(0);
			//value1 변수가 1과 같으면 0이 출력되게 if문 작성
		}
		
		scan.close();
	}

}
