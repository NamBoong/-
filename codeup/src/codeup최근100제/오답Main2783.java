package codeup�ֱ�100��;

import java.util.Scanner;

public class ����Main2783 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		int n = scan.nextInt();
		
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.next();
		}
		
		int count = 0;
		long check = 0;
		long answer = 0;
		
		while(count+s<=n) {
			
			for(int i=count; i<count+s; i++) {
				if(arr[i].contains("Ballad")) {
					check++;
				}
				if(check>answer) {
					answer = i;
				}
			}
			check = 0;
			count++;
		}
		
		if(check!=0) {
			System.out.println(answer-1);
		}
		
		if(check==0) {
			System.out.println(0);
		}
		
		
		scan.close();
	}

}

// 2020.10.09 ���� 1024����Ʈ �̻��� ������ �Է½� ���� �ٸ��� ����.