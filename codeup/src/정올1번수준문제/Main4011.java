package 정올1번수준문제;

import java.util.Scanner;

public class Main4011 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String n = scan.nextLine();
		
		String[] arr = n.split("");
		
		for(int i=0; i<n.length(); i++) {			
			if(Integer.valueOf(arr[7])==1) {
				System.out.printf(19+arr[0]+arr[1]+ "/" + arr[2] + arr[3] + "/" + arr[4]+arr[5] + " M");
				break;
			}
			
			if(Integer.valueOf(arr[7])==2) {
				System.out.printf(19+arr[0]+arr[1]+ "/" + arr[2] + arr[3] + "/" + arr[4]+arr[5] + " F");
				break;
			}
			
			if(Integer.valueOf(arr[7])==3) {
				System.out.printf(20+arr[0]+arr[1]+ "/" + arr[2] + arr[3] + "/" + arr[4]+arr[5] + " M");
				break;
			}
			
			if(Integer.valueOf(arr[7])==4) {
				System.out.printf(20+arr[0]+arr[1]+ "/" + arr[2] + arr[3] + "/" + arr[4]+arr[5] + " F");
				break;
			}
		}
		scan.close();
	}

}
