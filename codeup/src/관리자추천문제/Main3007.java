package 관리자추천문제;

import java.util.Scanner;

public class Main3007 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[][] arr2 = new int[m][2];
		for(int i=0; i<m; i++) {
			for(int j=0; j<2; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}
		
		int count = 0;
		int sum = 0;
		
		while(count<m) {
		for(int i=(arr2[count][0])-1; i<=(arr2[count][1])-1; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
		sum = 0;
			count++;
		}

		scan.close();
	}

}
//답은 나오지만 시간초과로 나온다.