package 정올1번수준문제;

import java.util.Scanner;

public class Main4691 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][4];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int count = 0;
		
		int[] dice = new int[6];
		int[] money = new int[n];
		int a = 0;
		int b = 0;
		
		while(count<n) {
			for(int i=0; i<4; i++) {
				if(arr[count][i]==1) {
					dice[0]++;
				}
				if(arr[count][i]==2) {
					dice[1]++;
				}
				if(arr[count][i]==3) {
					dice[2]++;
				}
				if(arr[count][i]==4) {
					dice[3]++;
				}
				if(arr[count][i]==5) {
					dice[4]++;
				}
				if(arr[count][i]==6) {
					dice[5]++;
				}

			}
			
			for(int i=0; i<6; i++) {
				if(i+1<6) {
				if(dice[i]==2 && dice[i+1]==2) {
					a = i+1;
					b = i+2;
				}
				}
				
				if(i+2<6) {
				if(dice[i]==2 && dice[i+2]==2) {
					a = i+1;
					b = i+3;
				}
				}
				
				if(i+3<6) {
				if(dice[i]==2 && dice[i+3]==2) {
					a = i+1;
					b = i+4;
				}
				}
				
				if(i+4<6) {
				if(dice[i]==2 && dice[i+4]==2) {
					a = i+1;
					b = i+5;
				}
				}
			}
		
			for(int i=0; i<6; i++) {
				//포카드
				if(dice[i]==4) {
					int temp = 50000+((i+1)*5000);
					if(temp>money[count]) {
						money[count] = temp;
					}
				}
				
				//트리플
				if(i+1<6) {
				if(dice[i]==3) {
					int temp = 10000+((i+1)*1000);
					if(temp>money[count]) {
						money[count] = temp;
					}
				}
				}
				
				//투페어
				if(dice[i]==2 && a!=0 && b!=0) {
					int temp = 2000+a*500+b*500;
					if(temp>money[count]) {
						money[count] = temp;
					}
				}
				
				
				//페어
				if(dice[i]==2) {
					int temp = 1000+(i+1)*100;
					if(temp>money[count]) {
						money[count] = temp;
					}
				}
				
				// 노페어
				if(dice[i]==1) {
					int temp = (i+1)*100;
					if(temp>money[count]) {
						money[count] = temp;
					}
				}			
			}
			
			for(int i=0; i<6; i++) {
				dice[i] = 0;
			}
						
			count++;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(money[i]<money[j]) {
					int temp = money[i];
					money[i] = money[j];
					money[j] = temp;
				}
			}

		}

		System.out.println(money[0]);
		scan.close();
	}

}
