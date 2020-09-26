package 정올1번수준문제;

import java.util.Scanner;

public class Main4746 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		int sec = scan.nextInt();
		int n = scan.nextInt();
		
		int a = (sec+n)/60;
		int b = (min+a)/60;
		
			//60초 안넘음
			if(sec+n<60) {
				System.out.println(hour + " " + min + " " + (sec+n));
			}
			
			//60초 넘음, 분은 시로 안넘음
			if(sec+n>=60 && a+min<60) {
				System.out.println(hour + " " + (min+a) + " " + ((sec+n)%60));
			}
			
			//60초 넘고, 시로 넘어갈때(시가 24를 안넘을경우)
			if(sec+n>=60 && a+min>=60 && hour+b<24) {
				System.out.println((hour+b) + " " + ((min+a)%60) + " " + ((sec+n)%60));
			}
			
			if(sec+n>=60 && a+min>=60 && hour+b>24) {
				System.out.println(((hour+b)%24) + " " + ((min+a)%60) + " " + ((sec+n)%60));
			}
			
		scan.close();
	}

}
