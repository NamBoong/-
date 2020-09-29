package 구조체연습;

import java.util.Scanner;

public class Main1805 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i][0]>arr[j][0]) {
					int temp = arr[i][0];
					arr[i][0] = arr[j][0];
					arr[j][0] = temp;
					
					int temp2 = arr[i][1];
					arr[i][1] = arr[j][1];
					arr[j][1] = temp2;
				}
			}
		}
		
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				System.out.printf(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
