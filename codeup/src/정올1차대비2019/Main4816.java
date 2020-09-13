package 정올1차대비2019;

import java.util.Scanner;

public class Main4816 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int counta = 0;
		int countb = 0;
		int countc = 0;
		
		while(t>0) {
			if(t>=300) {
				t = t-300;
				counta++;
			}
			if(t<300 && t>=60) {
				t = t-60;
				countb++;
			}
			if(t<60 && t>=10) {
				t = t-10;
				countc++;
			}
			if(t<10 && t!=0) {
				System.out.println(-1);
				break;
			}
		}
		
		if(t==0) {
		System.out.println(counta + " " + countb + " " + countc);
		}
		
		scan.close();
	}

}
