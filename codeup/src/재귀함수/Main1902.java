package ����Լ�;

import java.util.Scanner;

public class Main1902 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
		
		//���� ��ĵ���� ����n�� �ް� answer �Լ��� n ���� ���Խ�Ű�°ɷ� �Ѵ�.
	}
	
	public static void answer(int num) {
	// ���⼼�� n�� num�� �Ǿ���.
		if(num==0) {
			return;
			//0�� �Ǹ� ��ž�����ְ� return�� ������.
		}
		
		else {
			System.out.println(num);
			answer(num-1);
			//num�� ���� ����ϰ� num-1�� �� ���� �ٽ� ���� public static void answer�� ������.
			//�׷� ���� �Ŵ� answer(n-1)�̴�.
		}
	}
}
// �׷��� ������ ��� ����ؾ��ұ�?
