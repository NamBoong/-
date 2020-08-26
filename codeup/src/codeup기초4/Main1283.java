package codeup±‚√ 4;

import java.util.Scanner;

public class Main1283 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextInt();
		int b = scan.nextInt();
		double[] arr = new double[b];
		double sum = a;
		
		for(int i=0; i<b; i++) {
			arr[i] = scan.nextInt();
			sum = sum*arr[i]/100+sum;

		}
		System.out.format("%.0f\n", sum-a);

		if(sum-a>0) {
			System.out.println("good");
		}
		if(sum-a==0) {
			System.out.println("same");
		}
		if(sum-a<0) {
			System.out.println("bad");
		}
		scan.close();
	}

}
