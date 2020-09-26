package 정올1번수준문제;

import java.util.Scanner;

public class Main4596 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int answer = Integer.MIN_VALUE;
		int a = 0;
		int b = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(answer<arr[i][j]) {
					answer = arr[i][j];
					a = i+1;
					b = j+1;
				}
			}
		}
		
		System.out.println(answer);
		System.out.println(a + " " + b);
		scan.close();
	}

}
