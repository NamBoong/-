package codeup±‚√ 4;

import java.util.Scanner;

public class Main1277 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] arr = new int[a];
		
		for(int b=0; b<a; b++) {
		arr[b] = scan.nextInt();
		}
		System.out.println(arr[0]+" "+arr[(int) Math.ceil(a/2)]+" "+arr[a-1]);
		scan.close();
	}

}
