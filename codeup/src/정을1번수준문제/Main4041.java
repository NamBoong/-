package 정을1번수준문제;

import java.util.Scanner;

public class Main4041 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		String[] arr = n.split("");
		int answer = 0;
		double num = 0;
		
		for(int i=n.length()-1; i>=0; i--) {
			
			num = num + Integer.valueOf(arr[i])*Math.pow(10, i);
			
			answer = answer + Integer.valueOf(arr[i]);
		}
		
		System.out.format("%.0f", num);
		System.out.println("\n" + answer);
		scan.close();
	}

}
