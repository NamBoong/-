package codeup기초6;

import java.util.Scanner;

public class Main1615 {

	static Scanner scan = new Scanner(System.in);
	
	static int a = scan.nextInt();
	static int b = scan.nextInt();	
	
	static int[] c = new int[b + 1];

	public static void main(String[] args) {
			
		int finalanswer = 0;
		
			for (int i = 1; i <= b; i++) {
				answer(i);
			}

			for (int i = a; i <= b; i++) {
				if (c[i] == 0)
					finalanswer = finalanswer + i;
			}
			
			System.out.println(finalanswer);
		}
		

		public static void answer(int number) {

			int sum = number;

			while (number != 0) {
				int mod = number % 10;
				number /= 10;
				sum += mod;
			}

			if (sum <= b)
				c[sum] = 1;
		}
	}

//https://118k.tistory.com/727 여기의 코드를 보고 따라 쳐보며 배웠다. 공부하며 다시 풀어볼 예정이다.