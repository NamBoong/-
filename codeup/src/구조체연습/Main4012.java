package 구조체연습;

import java.util.Scanner;

public class Main4012 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		int[] arr2 = arr.clone();
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			arr2[i] = arr[i];
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int count = 0;
		int goal = 1;
		int a = 0;
	
		while(count<n) {
			if(arr[a]==arr2[count]) {
				System.out.println(arr2[count] + " " + goal);
				count++;
				goal = 1;
				a = 0;
			}
			
			if(a<n && count<n) {
			if(arr[a]!=arr2[count]) {
				goal++;
				a++;
			}
			}
		}		
		scan.close();
	}

}
