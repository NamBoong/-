package codeup����3;

import java.util.Scanner;

public class Main1218 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		while(true) {
		if((a==b) && (b==c)) {
			System.out.println("���ﰢ��");
			break;
		}
		if((((a==b) && (b!=c)) || ((a!=b) && (b==c))) && a+b>c) {
			System.out.println("�̵�ﰢ��");
			break;
		}
		if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)) {
			System.out.println("�����ﰢ��");
			break;
		}
		if((a<=b && b<=c) && a+b>c) {
			System.out.println("�ﰢ��");
			break;
		}
		else {
			System.out.println("�ﰢ���ƴ�");
			break;
		}
		}
		scan.close();
	}
}
