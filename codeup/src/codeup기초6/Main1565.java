package codeup����6;

import java.util.Scanner;

public class Main1565 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int answer = 0;
		
		for(int i=1; i<=2147483647; i++) {
			if(i%a==0 && i%b==0) {
				answer = i;
				System.out.println(answer);
				break;
			}
		}

		scan.close();
	}

}
// �ð��ʰ��� ������ �ּҰ������ �� ��������.
