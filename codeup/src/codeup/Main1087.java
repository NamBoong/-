package codeup;

import java.util.Scanner;

public class Main1087 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<=a; i++) {
			sum += i;
			if(sum>=a) {
				break;
			}
			}
		System.out.println(sum);
		
		scan.close();
	}

}
// ���õ� �� �� �ߴ�. �� Ǯ������� �� 10�� �־��µ� 55�� �ƴ϶� 15�� �������� ������ ����ߴ�.