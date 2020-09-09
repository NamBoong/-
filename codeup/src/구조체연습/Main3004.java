package 구조체연습;

import java.util.Scanner;

public class Main3004 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		int[] arr2 = new int[n];
		arr2 = arr.clone();
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			arr2[i] = arr[i];
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
			for(int j=0; j<n; j++) {
				if(arr2[i]==arr[j]) {
					System.out.printf(j + " ");
				}
				
			}
		}
		scan.close();
		
	}

}
// 답이 나오나 또 시간초과다...ㅠㅠ