package codeup;

import java.util.Scanner;

public class Main1078 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<=value1; i++) {
			if(i%2==0) {
				// i�� ¦���� ������ ���� �������� ��쿡�� ���� ���ϴ� ������ �޾��ش�.
				sum += i;
			}
		}
		System.out.println(sum);
		// ���ǹ��� �� �������� ������ϸ� ���� ��������.
		scan.close();
	}

}
// ����� ���� 8�� �Է������� �� 20�� �������� �����ϰ� 30�� �Ѱ� ����ߴ�. 2 4 6 8�� �����ؼ�....