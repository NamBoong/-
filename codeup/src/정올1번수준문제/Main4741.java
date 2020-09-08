package 정올1번수준문제;

import java.util.Scanner;

public class Main4741 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		int n = scan.nextInt();
		
		if(min+n>60 && (min+n)%60!=0) {
			
			if(hour+((min+n)/60)<24 && ((hour+((min+n)/60))%24!=0)) {
				
				System.out.printf((hour+(min+n)/60) + " " + ((min+n)-60*((min+n)/60)));
			}
			
			if(((hour+((min+n)/60))%24==0)) {
				System.out.println(0 + " " + ((min+n)-60*((min+n)/60)));
			}
			
			if(hour+((min+n)/60)>24 && (hour+((min+n)/60))%24!=0) {
				
				System.out.printf((hour+(min+n)/60)-(24) + " " + ((min+n)-60*((min+n)/60)));
			}
		}
		
		if(min+n>=60 && (min+n)%60==0) {
			
			if(hour+(min+n)/60!=24) {
				
				System.out.printf((hour+(min+n)/60) + " " + 0);
			}
			
			if(hour+(min+n)/60==24) {
				System.out.println(0 + " " + 0);
			}
		}
		
		if(min+n<60) {
			
			System.out.printf((hour) + " " + ((min+n)));
			
		}
		
		scan.close();
	}

}
