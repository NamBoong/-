package 정올1번수준문제;

import java.util.Scanner;

public class Main4771 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		String[] arr = a.split("");
		
		int sum = 0;
		
		for(int i=0; i<a.length(); i++) {
			if(i+1<a.length()) {
			
			if(arr[i].charAt(0)==40 && arr[i+1].charAt(0)!=40) {
				sum = sum + 10;
			}
			
			if(arr[i].charAt(0)==41 && arr[i+1].charAt(0)!=41) {
				sum = sum + 10;
			}
			
			if(arr[i].charAt(0)==40 && arr[i+1].charAt(0)==40) {
				sum = sum + 5;
			}
			
			if(arr[i].charAt(0)==41 && arr[i+1].charAt(0)==41) {
				sum = sum + 5;
			}
			}
			
		}
		
		System.out.println(10+sum);
		scan.close();
	}

}
