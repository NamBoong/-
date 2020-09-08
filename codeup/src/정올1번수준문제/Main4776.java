package 정올1번수준문제;

import java.util.Scanner;

public class Main4776 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] sibgan = new int[10];
		int[] sibeasy = new int[12];
		
		for(int i=0; i<10; i++) {
			sibgan[i] = i;
		}
		
		for(int i=0; i<12; i++) {
			sibeasy[i] = 101+i;
		}
		
		int answer1 = 0;
		int answer2 = 0;
					
			for(int j=0; j<10; j++) {
				if(j==n%10) {
					answer1 = sibgan[j]+6;
					if(answer1>=10) {
						answer1 = answer1-10;
					}
				}
			}
		
		
			for(int i=0; i<12; i++) {
				if(i==n%12) {
					answer2 = sibeasy[i]-40;
					if(answer2<=64) {
						answer2 = answer2 + 12;
					}
				}
			}
		
			
			System.out.println((char)answer2 + "" + answer1);
			scan.close();
	}

}
