package codeup기초4;

import java.util.Scanner;

public class Main1295 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		
		while(true) {
		// 정말 무식하게 아스키 코드에서 소문자와 대문자는 서로 교환해주고 나머지 부분은 그대로 쓰도록 아스키 코드 영역을 다 잘랐다.
		// ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
			for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)>=65 && a.charAt(i)<=90) {
				System.out.printf((char)(a.charAt(i)+32)+"");
			}
			if(a.charAt(i)>=97 && a.charAt(i)<=122) {
				System.out.printf((char)(a.charAt(i)-32)+"");
			}
			if(a.charAt(i)<65) {
				System.out.printf((char)a.charAt(i)+"");
			}
			if(a.charAt(i)>90 && a.charAt(i)<97) {
				System.out.printf((char)a.charAt(i)+"");
			}
			if(a.charAt(i)>122) {
				System.out.printf((char)a.charAt(i)+"");
			}
			}
			break;
		}
		scan.close();
	}

}
