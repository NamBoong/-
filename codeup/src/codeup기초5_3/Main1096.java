package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1096 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		int[][] arr = new int[19][19];

		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			arr[x-1][y-1] = 1;
		}
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				System.out.printf(arr[i][j]+" ");
			}
			System.out.printf("\n");
		}

		}
	}