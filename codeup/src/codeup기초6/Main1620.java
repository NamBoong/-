package codeup±‚√ 6;

import java.util.Scanner;

public class Main1620 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String n = scan.nextLine();
		String[] arr = n.split("");
		int[] arr2 = new int[n.length()];
		
		int sum = 0;
		
			for(int i=0; i<n.length(); i++) {
				arr2[i] = Integer.valueOf(arr[i]);
				sum = sum + arr2[i];
			}
			
			if(sum<10) {
				System.out.println(sum);
			}
			
			if(sum>=10) {
				int a = sum/10;
				int b = sum%10;
				
				
				if(a+b<10) {
					System.out.println(a+b);
				}
				
				if(a+b>=10) {
					int c = (a+b)/10;
					int d = (a+b)%10;
					
					if(c+d<10) {
						System.out.println(c+d);
					}
				}
			}
			
			scan.close();
	}

}
