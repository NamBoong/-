package codeupÃÖ±Ù100Á¦;

import java.util.Scanner;

public class Main4082 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double drink = scan.nextDouble();
		double alchol = scan.nextDouble();
		double weight = scan.nextDouble();
		double sex = scan.nextDouble();
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		double a = drink*(alchol/100.000)*0.7984;
		
		double c = 0;
		
		if(sex==1) {
			c = (a/(weight*0.700))/10;
		}
		
		if(sex==2) {
			c = (a/(weight*0.600))/10;
		}
		
		double time = 0;
		
		if(min>=30) {
			time = hour + (min-30)/60.00;
		}
		
		if(min<30) {
			time = (hour-1)+((min+30)/60.00);
		}
		
		double ct = c-(0.015*time);
		
		double answer = Double.parseDouble(String.format("%.3f", ct));
		
		if(answer<=0.00) {
			System.out.println("0.000 pass");
		}
		
		if(answer<0.03 && answer>0.00) {
			System.out.println(String.format("%.3f", ct) + " pass");
		}
		
		if(answer>=0.03 && answer<0.08) {
			System.out.println(String.format("%.3f", ct) + " stop");
		}
		
		if(answer>=0.08) {
			System.out.println(String.format("%.3f", ct) + " cancel");
		}
		
		scan.close();
	}

}
