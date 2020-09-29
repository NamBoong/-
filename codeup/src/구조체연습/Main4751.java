package 구조체연습;

import java.util.Scanner;

public class Main4751 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i][2]<arr[j][2]) {
					int temp = arr[i][2];
					arr[i][2] = arr[j][2];
					arr[j][2] = temp;
					
					int temp1 = arr[i][1];
					arr[i][1] = arr[j][1];
					arr[j][1] = temp1;
					
					int temp0 = arr[i][0];
					arr[i][0] = arr[j][0];
					arr[j][0] = temp0;
				}
			}
		}
		
		System.out.println(arr[0][0] + " " + arr[0][1]);
		System.out.println(arr[1][0] + " " + arr[1][1]);
		
		int count = 2;
		while(count<n) {
			if(arr[0][0]!=arr[count][0] || arr[1][0]!=arr[count][0]) {
				System.out.println(arr[count][0] + " " + arr[count][1]);
				break;
			}
			count++;
		}
		scan.close();
	}

}
