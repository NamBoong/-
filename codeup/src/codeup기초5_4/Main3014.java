package codeup����5_4;

import java.util.Scanner;

public class Main3014 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int k=i+1; k<n; k++) {
				if(arr[i]>arr[k]) {
					int empt = arr[i];
					arr[i] = arr[k];
					arr[k] = empt;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.printf(arr[i] + " ");
		}
		scan.close();
	}

}
// ������ �������� �ڹٷδ� �ð��ʰ��� ������ �Ѱ谡 �ִ�. ������ ������ ������ �Ѿ��.