package 스택;

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
		// 현재 스택에 일부만 들어가고있어서 밤에 재확인 할 예정이다.
		// 5개 입력하였으나 4개만 출력되어서 첫번째가 안들어가는건지 확인이 필요함.
		
		while(stack.empty()!=true) {
			System.out.println(stack.pop());
		}
		
		scan.close();
	}

}
