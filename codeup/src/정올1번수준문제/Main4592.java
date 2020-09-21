package 정올1번수준문제;

import java.util.Scanner;

public class Main4592 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n*2];
		int[][] arr2 = new int[100][100];
		
		for(int i=0; i<n*2; i++) {
				arr[i] = scan.nextInt();
		}
			
		
		for(int i=0; i<n*2; i++) {
			if(i%2==0 && 1+i<n*2) {
				
				for(int k=arr[i+1]; k<arr[i+1]+10; k++) {
					for(int j=arr[i]; j<arr[i]+10; j++) {
						arr2[k][j] = 1;
					}
				}
			}
		}
		
		int sum = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
					if(arr2[i][j]==1) {
						sum++;
					}
				}
			}

		System.out.println(sum);
		scan.close();
	
	}

}
