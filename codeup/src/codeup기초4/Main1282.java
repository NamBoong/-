package codeup����4;

import java.util.Scanner;

public class Main1282 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 1;
		int answer = 0;
		
		for(count=1; count<n; count++) {
			if(Math.pow(count, 2)<=n) {
				answer = count;
			}
		}
		System.out.printf((n-(int) Math.pow(answer, 2)) + " " + answer);
		scan.close();
	}

}
// ���� �ٷ� ������ �ڵ������ �ð��ʰ��� ���. ���𿡵� for���� �ϳ��� �̿��϶�� �ϳ��� �̷�����ִµ� �� �����ɸ����� �𸣰ڴ�.