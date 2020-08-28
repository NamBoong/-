package codeup기초5;

import java.util.Scanner;

public class Main1402 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];

		
		for(int a=0; a<n; a++) {
			arr[a] = scan.nextInt();			
		}
			
		for(int i=arr.length-1; 0<=i; i--) {
			System.out.print(arr[i]+" ");
		//배열은 거꾸로 출력하려면 길이에서 -1씩 해줘야한다.... arr[n-1]로 해보려고했었다.
		}
		scan.close();
	}

}
