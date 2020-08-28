package codeup±‚√ 5_2;

import java.util.Scanner;

public class Main1410 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		int[] b = new int[a.length()];
		int count1 = 0;
		int count2 = 0;
		
		for(int x=0; x<a.length(); x++) {
			b[x] = a.charAt(x);
			
			if(b[x]==40) {
				count1++;
			}
			if(b[x]==41) {
				count2++;
			}
		}
		System.out.printf(count1+" "+count2);
		scan.close();
	}

}
