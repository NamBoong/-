package ����1�����ع���;

import java.util.Scanner;

public class Main4036 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		for(int i=2; i<=1000000; i++) {
			for(int j=0; j<=999998; j++) {
				if(i+j==n && i-j==m) {
					System.out.println(i);
					System.out.println(j);
					break;
				}
			}
		}
		scan.close();
	}

}
// ������ �ʹ� Ŀ�� �ð� �ʰ��� ���´�. �׷��� ������ ���̸� �׽�Ʈ ���̽����� ���������⿡ ��ǻ� �ð��ʰ��� �ȳ����� ����� ���٤Ф�