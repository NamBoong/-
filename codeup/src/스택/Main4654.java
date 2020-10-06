package ����;

import java.util.Scanner;
import java.util.Stack;

public class Main4654 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count = n-1;
		
		while(count>=1) {
			for(int i=count-1; i>=0; i--) {
				if(arr[i]>arr[count]) {
					stack.push(i+1);
					break;
				}
				else {
					stack.push(0);
					break;
				}
				
			}
			count--;
		}
		// ���� ���ÿ� �Ϻθ� �����־ �㿡 ��Ȯ�� �� �����̴�.
		// 5�� �Է��Ͽ����� 4���� ��µǾ ù��°�� �ȵ��°��� Ȯ���� �ʿ���.
		
		while(stack.empty()!=true) {
			System.out.println(stack.pop());
		}
		
		scan.close();
	}

}
