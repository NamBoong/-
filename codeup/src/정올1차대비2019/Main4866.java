package 정올1차대비2019;

import java.util.Scanner;

public class Main4866 {

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
	
		int[] zero = new int[3];
		int[] one = new int[3];
		
		for(int i=0; i<n; i++) {
			if(arr[i][1]==1 || arr[i][1]==2) {
				if(arr[i][0]==0) {
					zero[0]++;
				}
				
				if(arr[i][0]==1) {
					one[0]++;
				}
			}
			
			if(arr[i][1]==3 || arr[i][1]==4) {
				if(arr[i][0]==0) {
					zero[1]++;
				}
				
				if(arr[i][0]==1) {
					one[1]++;
				}
			}
			
			if(arr[i][1]==5 || arr[i][1]==6) {
				if(arr[i][0]==0) {
					zero[2]++;
				}
				
				if(arr[i][0]==1) {
					one[2]++;
				}
			}
		}
		
		int sum = 0;	
		int count = 1;
		
		while(count<3) {
			
			if(zero[count]/k==0 && zero[count]%k!=0) {
				sum++;
			}
			
			if(zero[count]/k!=0 && zero[count]%k==0) {
				sum = sum + zero[count]/k;
			}
			
			if(zero[count]/k!=0 && zero[count]%k!=0) {
				sum = sum + (int)Math.ceil((double)zero[count]/k);
			}
			count++;
		}
		
		count = 1;
		
		while(count<3) {
			
			if(one[count]/k==0 && one[count]%k!=0) {
				sum++;
			}
			
			if(one[count]/k!=0 && one[count]%k==0) {
				sum = sum + one[count]/k;
			}
			
			if(one[count]/k!=0 && one[count]%k!=0) {
				sum = sum + (int)Math.ceil((double)one[count]/k);
			}
			count++;
		}
		
		if((one[0]+zero[0])/k==0 && (one[0]+zero[0])%k!=0) {
			sum++;
		}
		
		if((one[0]+zero[0])/k!=0 && (one[0]+zero[0])%k==0) {
			sum = sum + (one[0]+zero[0])/k;
		}
		
		if((one[0]+zero[0])/k!=0 && (one[0]+zero[0])%k!=0) {
			sum = sum + (int)Math.ceil((double)(one[0]+zero[0])/k);
		}
		
		
		System.out.println(sum);
		scan.close();
		
	}

}
