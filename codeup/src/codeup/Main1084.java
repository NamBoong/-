package codeup;

import java.util.Scanner;

public class Main1084 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int g = scan.nextInt();
		int b = scan.nextInt();
		int i = 0;
		
		for(int x=0; x<r; x++) {
			for(int y=0; y<g; y++) {
				for(int z=0; z<b; z++) {
					System.out.println(x + " " + y + " " + z);
					i++;
				}
			}
		}
		System.out.println(i);
		scan.close();
	}

}

// �ڵ������ �� ���� C�̱⿡ �ڹٿ��� print ��¹��� �ð��� �����ɷ� �ð��ʰ��� ���´ٰ��Ѵ�.
// ���� ��Ȱ� ���� ���Դٸ� ����������� �¾Ҵٰ��ϰ� �Ѿ��!
