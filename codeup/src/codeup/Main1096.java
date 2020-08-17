package codeup;

import java.util.Scanner;

public class Main1096 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[20][20];
		//2차원 배열 생성
		int x;
		int y;
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
		//x와 y 변수를 받아서 배열에 넣어서 해당하는 부분은 1로 표기
			x = scan.nextInt();
			y = scan.nextInt();
			arr[x-1][y-1] = 1;
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
			//19개가 0이 찍히고 줄바꿈을 하기위해 넣었다.
		}
		scan.close();
	}

}
