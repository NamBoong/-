package codeup����5_4;

import java.util.Scanner;

public class Main1451 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		// ũ�⸸ŭ �迭 ��ĵ���� for���� ���⼭ ������.
		
		for(int j=0; j<n; j++) {
			for(int k=j+1; k<n; k++) {
				
		// for �ΰ��� �����ϴµ� ���ڴ� ���ڸ� �޾Ƽ� 1�� �����ϰ� �Ѵ�. �� ���� for�� ù��° ���� �������� ���� for�� �ι�° ���� �����°Ŵ�.
				if(arr[j]>arr[k]) {
					int tmep = arr[j];
		// tmep �������� arr j�� �ް� j�� k�� �ǰ� k�� �ٽ� tmep�� �Ǵ°Ŵ�. tmep�� j�� k�� �̵��ϱ����� ���������Ѵٰ� ��������.
					arr[j] = arr[k];
					arr[k] = tmep;
				}
		}
		}
		
		for(int a=0; a<n; a++) {
			System.out.println(arr[a]);
		}
		scan.close();
	}

}
