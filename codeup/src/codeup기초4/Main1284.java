package codeup����4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1284 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		//2���� ũ�Ⱑ ������ ������ �迭 2���� ������ش�.
		
		for(int i=2; i<a; i++) {
		// i�� 1���� ������ �翬�� �������� 0�� �����⿡ 2�����ؼ� 1�� �迭�� �߰��� ���ش�.
			if(a%i==0) {
				arr1.add(i);
			}
		}
		if(arr1.size()==2) {
		// 1�� �迭�� �߰��� ������ ũ�Ⱑ 2���(���� 1���� ũ�Ⱑ 2�̴�)
			for(int i=1; i<=arr1.get(0); i++) {
				if(arr1.get(0)%i==0) {
					arr2.add(i);
					// �������� ������ �����ϱ����� add�� ����. 3�� 7�� �������� 7�� �� ũ�ϱ� add(7)�� �Ǹ� ���� �������� �ڿ� ���δ�.
				}
			}
			for(int i=1; i<=arr1.get(1); i++) {
				if(arr1.get(1)%i==0) {
					arr2.add(i);
					// 2��°�� ���� ���� ���������� ������������ �������� �ش�.
				}
			}
		if(arr2.size()==4) {
			//���ڰ� 2���� ũ�⵵ 2+2�� 4�� �ȴ�.
			System.out.printf(arr1.get(0)+" "+arr1.get(1));
			//���� ù��° ���� ���� �׸��� �ι�° ���� ���ڸ� ���ְ� �������� ��� wrong number�� ���´�.
		}
		else {
			System.out.printf("wrong number");
		}
		}
		else {
			System.out.printf("wrong number");
		}
		scan.close();
	}
}
