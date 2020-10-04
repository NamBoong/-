package 이분탐색;

import java.util.Scanner;

public class Main3006 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int[] arr = new int[k];
		
		for(int i=0; i<k; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count = 0;
		int[] arr2 = new int[k];
		
		while(count<k) {
			for(int i=1; i<=arr[count]; i++) {
				if(Math.pow(i, 2)<=arr[count]) {
					arr2[count] = (int)Math.pow(i, 2);
				}
			}		
			count++;
		}
			
		
		for(int i=0; i<k; i++) {
			System.out.println(arr2[i]);
		}
		
		scan.close();
	}

}

// 답은 나오지만 시간초과.