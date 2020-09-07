package 정올1번수준문제;

import java.util.Scanner;

public class Main4021 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[7];
		int answer = 0;
		int count = 0;
		
		for(int i=0; i<7; i++) {
			arr[i] = scan.nextInt();
			
			if(arr[i]%2==1) {
				answer = answer + arr[i];
			}
			
			if(arr[i]%2==0) {
				count++;
				if(count==7) {
					answer = -1;
				}
			}
		}
		
		System.out.println(answer);
		scan.close();
	}

}
