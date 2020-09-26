package ±×¸®µð;

import java.util.Scanner;

public class Main3301 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int index = 0;
		int answer = 0;
		
		while(n!=0) {
			int change = n / array[index];
			
			n = n - (change*array[index++]);
			
			answer = answer + change;
			
		}
			
		System.out.println(answer);
	
		scan.close();
		
	}

}
