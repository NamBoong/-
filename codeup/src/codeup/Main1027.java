package codeup;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Main1027 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		String pattern = "^[0-9]*.[0-9]*.[0-9]*$";
		// ��.��.�� �� ������ �شٰ������� ���������� �������� �ԷµɰŶ�� �˷�����
		
		String value1 = scan.nextLine();
		//value1�� �ܺο��� �ԷµǴ� ���� �޴� ����

		scan.close();
		
		if(Pattern.matches(pattern, value1)) {
			//�츮�� ���� ���ϰ� �ܺο��� �Է��� ��value1 ������ ��ġ�ϴ��� Ȯ�ν�Ű��
			String[] value2 = value1.split("\\.");
			//���� �ܺο��� �� value1 ���� ���� value2�� ������ش�.
		
			int year = Integer.parseInt(value2[0]);
			int month = Integer.parseInt(value2[1]);
			int day = Integer.parseInt(value2[2]);
			
			System.out.printf("%02d-%02d-%04d", day, month, year);
			
			}
		}
		
	}


