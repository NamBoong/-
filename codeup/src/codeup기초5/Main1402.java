package codeup����5;

import java.util.Scanner;

public class Main1402 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];

		
		for(int a=0; a<n; a++) {
			arr[a] = scan.nextInt();			
		}
			
		for(int i=arr.length-1; 0<=i; i--) {
			System.out.print(arr[i]+" ");
		//�迭�� �Ųٷ� ����Ϸ��� ���̿��� -1�� ������Ѵ�.... arr[n-1]�� �غ������߾���.
		}
		scan.close();
	}

}
