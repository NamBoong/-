package codeup;

import java.util.Scanner;

public class Main1096 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[20][20];
		//2���� �迭 ����
		int x;
		int y;
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
		//x�� y ������ �޾Ƽ� �迭�� �־ �ش��ϴ� �κ��� 1�� ǥ��
			x = scan.nextInt();
			y = scan.nextInt();
			arr[x-1][y-1] = 1;
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
			//19���� 0�� ������ �ٹٲ��� �ϱ����� �־���.
		}
		scan.close();
	}

}
