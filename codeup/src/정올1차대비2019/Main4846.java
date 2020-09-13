package 정올1차대비2019;

import java.util.Scanner;

public class Main4846 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n*2];
		
		for(int i=0; i<n*2; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] answer = new int[n];
		int count = 0;
		
		for(int i=0; i<n*2; i++) {
			if(i+1<n*2) {
				answer[count] = arr[i+1]%arr[i];
				i++;
				count++;
			}
		}
		
		int result = 0;		
		for(int i=0; i<n; i++) {
			result = result + answer[i];
		}
		
		System.out.println(result);
		scan.close();
	}

}
