package codeup;

import java.util.Scanner;

public class Main1076 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.next();
		
		for(int answer1=97; answer1 <= value1.getBytes()[0]; answer1++) {
			// �ƽ�Ű�ڵ� 97�� a�̴�. a���� �����ؼ� value1�� ����Ʈ�� �ٲ� ���� ��ġ�ϴ��� Ȯ�ν�Ű��, 1�� �������״�.
			System.out.println((char)answer1 + "");
			// ���ڸ� �ٽ� �ƽ�Ű�ڵ� ���ڷ� ��������ش�. 
		}
		scan.close();
	}
}