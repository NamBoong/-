package codeup����5_2;

import java.util.Scanner;

public class Main1418 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		String a = scan.nextLine();
		int[] arr = new int[a.length()];
		
		
		for(int i=0; i<a.length(); i++) {
			arr[i] = a.charAt(i);
		
			if(arr[i]==116) {
			int j = i+1;
			// �迭�� 0���� ����-1���� �����Ǿ �ڸ���ȣ ���Ҷ� +1�� �ٽ� �����.
			System.out.printf(j+" ");
			}
		}
		scan.close();
		}
	}