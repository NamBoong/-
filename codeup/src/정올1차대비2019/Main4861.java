package 정올1차대비2019;

import java.util.Scanner;

public class Main4861 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i][1]>arr[j][1]) {
					int temp = arr[i][1];
					arr[i][1] = arr[j][1];
					arr[j][1] = temp;
					
					int temp2 = arr[i][0];
					arr[i][0] = arr[j][0];
					arr[j][0] = temp2;
				}
			}
		}
		
		int[] zero = new int[6];
		int[] one = new int[6];
		int count = 0;
		
		while(count<=6) {
			for(int i=0; i<n; i++) {
					
				if(arr[i][1]==count+1) {
					if(arr[i][0]==0) {
						zero[count]++;
					}
					if(arr[i][0]==1) {
						one[count]++;
					}				
				}				
			}
			count++;
		}	
		
		int room1 = 0;
		int room2 = 0;
		for(int i=0; i<6; i++) {
			
			if(zero[i]!=0) {
				room1 = room1 + (int) (Math.ceil((double)zero[i]/k));
			}
			
			if(one[i]!=0) {
				room2 = room2 + (int) (Math.ceil((double)one[i]/k));
			}
		}
		
		System.out.println(room1 + room2);
		
		
		scan.close();
	}

}
