package codeup;

import java.util.Scanner;

public class Main1018_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.next();
		
		String[] arr = value1.split(":");
		// ���ڸ� []�� ���ڸ� �Űܼ� ���ݺ��� �迭�� �ϰڴٴ� �ǹ��̴�. value1�� ������ ������ �и��ϴ� ������ :�� ��´�.
		
		
		int hour = Integer.valueOf(arr[0]);
		int min = Integer.valueOf(arr[1]);
		// ����string�� ���� int������ hour�� min�� �������̴�. �ð� : �� ���� �� 2���� �޾ƾ��ϴϱ� arr[0]���� arr[1]�����̴�.
		
		System.out.printf("%d:%d", hour, min);
		// ���� �迭��arr[0~x]�� ������ ���� �������� ��Ÿ���޶���ϴ°Ŵ�. �� �ڿ� ������ ���Ŀ� ���� �迭���� �־��ش�.	
		
		scan.close();

	}

}
