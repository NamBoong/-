package 인덱스트리;

import java.util.Scanner;

public class Main3210 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int m = scan.nextInt();
		int[][] arr2 = new int [m][2];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<2; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}
		
		int count = 0;
		int[] answer = new int[m];
		
		while(count<m) {
			for(int i=arr2[count][0]-1; i<=arr2[count][1]-1; i++) {
				if(arr[i]>answer[count]) {
					answer[count] = arr[i];
				}
			}
			count++;
		}
		
		for(int i=0; i<m; i++) {
			System.out.printf(answer[i] + " ");
		}
		
		scan.close();
	}

}

// 인덱스 트리로 풀지않았더니 시간초과가 나왔다.