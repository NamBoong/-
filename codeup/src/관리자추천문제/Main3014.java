package 관리자추천문제;

import java.util.Scanner;

public class Main3014 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.printf(arr[i] + " ");
		}
		scan.close();
	}

}

// 자바로는 시간초과가 나온다고한다. 답은 나오니 패스하자
