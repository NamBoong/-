package codeup����4;

import java.util.Scanner;

public class Main1295 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		
		while(true) {
		// ���� �����ϰ� �ƽ�Ű �ڵ忡�� �ҹ��ڿ� �빮�ڴ� ���� ��ȯ���ְ� ������ �κ��� �״�� ������ �ƽ�Ű �ڵ� ������ �� �߶���.
		// �ФФФФФФФФФФФФФФФФФФФФФФФФФФФ�
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
