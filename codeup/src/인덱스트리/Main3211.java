package 인덱스트리;

import java.util.Scanner;

public class Main3211 {

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
		int[] min = new int[m];
		int[] max = new int[m];
		
		for(int i=0; i<m; i++) {
			min[i] = Integer.MIN_VALUE;
			max[i] = Integer.MAX_VALUE;
		}
		
		while(count<m) {
			for(int i=arr2[count][0]-1; i<=arr2[count][1]-1; i++) {
				if(arr[i]<max[count]) {
					max[count] = arr[i];
				}
				if(arr[i]>min[count]) {
					min[count] = arr[i];
				}
			}
			count++;
		}
		
		for(int i=0; i<m; i++) {
			System.out.println(min[i]-max[i]);
		}
		
		scan.close();
	}

}

// 답은 나오지만 역시 시간초과이다.