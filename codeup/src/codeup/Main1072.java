package codeup;

import java.util.Scanner;

public class Main1072 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		
		int[] arr = new int[value1];
		// arr �迭�̱�� �ԷµǴ� ������ �޴´�.
		
		for(int i=0; i<value1; i++) {
			// i�� value1�� �Էµ� ������ 1�� �����ϰ� �����.
			arr[i] = scan.nextInt();
			// �迭�� i(0����) �־��� ������ �ν��Ѵ�.
		}
		
		for(int i=0; i<value1; i++) {
			System.out.println(arr[i]);
			// �迭�� ���� ���� �ϳ��� ����ϰ� �Ѵ�. ������ for�� �����ִ�.
		}
		scan.close();
		
	}

}
