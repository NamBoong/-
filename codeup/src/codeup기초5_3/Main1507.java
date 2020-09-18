package codeup±‚√ 5_3;

import java.util.Scanner;

public class Main1507 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[100][100];
		
		int[] num = new int[16];
		
		for(int i=0; i<16; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i=0; i<16; i++) {
			if(i%4==0) {
				
				for(int j=num[i]; j<num[i+2]; j++) {
					for(int k=num[i+1]; k<num[i+3]; k++) {
						arr[j][k] = 1;
					}
				}
			}
		}
		
		int count = 0;
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(arr[i][j]==1) {
					count++;
				}
			}
		}
		System.out.println(count);
		scan.close();
	}

}
