package codeup기초5_2;

import java.util.Scanner;

public class Main1418 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		String a = scan.nextLine();
		int[] arr = new int[a.length()];
		
		
		for(int i=0; i<a.length(); i++) {
			arr[i] = a.charAt(i);
		
			if(arr[i]==116) {
			int j = i+1;
			// 배열은 0부터 길이-1까지 측정되어서 자리번호 구할땐 +1을 다시 해줬다.
			System.out.printf(j+" ");
			}
		}
		scan.close();
		}
	}