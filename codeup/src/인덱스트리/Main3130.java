package 인덱스트리;

import java.util.Scanner;

public class Main3130 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		long[] arr = new long[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count = 0;
		long answer = 0;
		
		while(count<n) {
			for(int i=count+1; i<n; i++) {
				if(arr[count]>arr[i]) {
					answer++;
				}
				if(arr[count]<=arr[i]){
					break;
				}
			}
			count++;
		}
		
		System.out.println(answer);
		
		scan.close();
	}

}

// 답은 나오나 시간초과가 나옴.