package codeup±‚√ 4;

import java.util.Scanner;

public class Main1266 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] arr = new int[a];
		int answer = 0;
		
		for(int i=0; i<a; i++) {
			arr[i] = scan.nextInt();
			answer = answer + arr[i];
		} 
		System.out.println(answer);
		scan.close();
	}
}
