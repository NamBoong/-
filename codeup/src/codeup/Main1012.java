// �����ϱ� �ռ��� �Ҽ��� 6�ڸ��� ������ ���ϴ� �����̴�. (��! ���ۿ� ��������!)

package codeup;

import java.util.Scanner;

public class Main1012 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		// 3��°�غ��� ���� �ܿ� ���� ���� �� ����.
		
		Double value1 = scan.nextDouble();
		// float�� Double�� ���� �������� ���� ���� ��Ȯ�ϰ� ������ �������� Double�� ������Ѵ�.
		// float�� �ڿ� 2.157765F�� ������Ѵٴ� �͸� �˰��ֱ⿡ �츮�� ���ڸ� ���ϴ� Double�� ����.
		
		scan.close();
		
		System.out.println(String.format("%.6f", value1));
		// ���Ⱑ ��񿴴�. sout(����.�����ش޶�("%.6��° �Ҽ�������", ������)); �̷��� �ؼ��ߴ�.
		// �� Math.round()�� ���ߴ°��� ������ ���� ���̰� �ִ�.
		// �Ʒ��� ������ �����غ��� �� �� �ִ�.
		
		// Double x = (double) 10000;
		// System.out.println(Math.round((x*100)/100.0));
		// System.out.println(String.format("%.3f", x));
		
		// ���� ���� �Է��ϰ� ����غ��� Math.round�� �� ������ ������ ��쿣 �Ҽ����� ���� �����ʴ´�.
		// String.format�� �����ϰ� ������ ���("%.���ϴ� �Ҽ��� �ڸ���f")���� �� ���ش�.
		
	}

}
