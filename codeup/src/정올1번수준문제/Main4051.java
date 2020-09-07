package 정올1번수준문제;

import java.util.Scanner;

public class Main4051 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double[] arr = new double[10];
		double sum = 0;
		double sum2 = 0;
		double sum3 = 0;
		
		for(int i=0; i<10; i++) {
			arr[i] = scan.nextDouble();
		}
		
		for(int i=0; i<10; i++) {
			if(i+1<10 && i%2==0) {
				
			if(arr[i+1]-arr[i]>=1 && arr[i+1]-arr[i]<5) {
				sum = sum + arr[i+1]-arr[i] -1;
			}
			
			if(arr[i+1]-arr[i]>=5) {
				sum3 = sum3 + 4;
			}
			
		}
	}

		
		if(sum+sum2+sum3>=15) {
			System.out.format("%.0f", ((sum+sum2+sum3)/0.5*5000)*0.95);
		}
		
		if(sum+sum2+sum3<=5) {
			System.out.format("%.0f", ((sum+sum2+sum3)/0.5*5000)*1.05);
		}
		
		if(sum+sum2+sum3>5 && sum+sum2+sum3<15) {
			System.out.format("%.0f", ((sum+sum2+sum3)/0.5*5000));
		}
		
		scan.close();
	}

}
