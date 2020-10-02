package 정올1번수준문제;

import java.util.Scanner;

public class Main4721 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int[] point = new int[3];
		
		for(int i=0; i<n; i++) {
			point[0] = point[0] + arr[i][0];
			point[1] = point[1] + arr[i][1];
			point[2] = point[2] + arr[i][2];
		}
		
		int[] count = new int[9];
		
		for(int i=0; i<n; i++) {
			
			//3점
			if(arr[i][0]==3) {
				count[0]++;
			}
			
			if(arr[i][1]==3) {
				count[1]++;
			}
			
			if(arr[i][2]==3) {
				count[2]++;
			}
			
			//2점
			if(arr[i][0]==2) {
				count[3]++;
			}
			
			if(arr[i][1]==2) {
				count[4]++;
			}
			
			if(arr[i][2]==2) {
				count[5]++;
			}
			
			//1점
			if(arr[i][0]==2) {
				count[6]++;
			}
			
			if(arr[i][1]==2) {
				count[7]++;
			}
			
			if(arr[i][2]==2) {
				count[8]++;
			}
		}
		
		
		
		int best = 0;
		int max = Math.max(point[0], Math.max(point[1], point[2]));
		
		if(max==point[0]) {
			best++;
		}
		
		if(max==point[1]) {
			best++;
		}
		
		if(max==point[2]) {
			best++;
		}
		
		
		//투표가 1개만 클 경우		
		if(best==1) {
			if(max==point[0]) {
			System.out.println(1 + " " + point[0]);
			}

			if(max==point[1]) {
			System.out.println(2 + " " + point[1]);
			}

			if(max==point[2]) {
			System.out.println(3 + " " + point[2]);
			}
		}
		
		//투표가 2개만 같을 경우
		if(best==2) {
			//1과 2가 같을 경우
			if(max==point[0] && max==point[1]) {
				if(count[0]>count[1]) {
					System.out.println(1 + " " + point[0]);
				}
				
				if(count[0]<count[1]) {
					System.out.println(2 + " " + point[1]);
				}
				
				if(count[0]==count[1]) {
					if(count[3]>count[4]) {
						System.out.println(1 + " " + point[0]);
					}
					if(count[3]<count[4]) {
						System.out.println(2 + " " + point[1]);
					}
					
					if(count[3]==count[4]) {
						System.out.println(0 + " " + point[0]);
					}
				}
			}
			
			//1과 3이 같을 경우
			if(max==point[0] && max==point[2]) {
				if(count[0]>count[2]) {
					System.out.println(1 + " " + point[0]);
				}
				
				if(count[0]<count[2]) {
					System.out.println(3 + " " + point[2]);
				}
				
				if(count[0]==count[2] && (point[0]!=point[1] || point[2]!=point[1])) {
					if(count[3]>count[5]) {
						System.out.println(1 + " " + point[0]);
					}
					if(count[3]<count[5]) {
						System.out.println(3 + " " + point[2]);
					}
					
					if(count[3]==count[5]) {
						System.out.println(0 + " " + point[0]);
					}
				}
			}
			
			//2와 3이 같을 경우
			if(max==point[1] && max==point[2]) {
				if(count[1]>count[2]) {
					System.out.println(2 + " " + point[1]);
				}
				
				if(count[1]<count[2]) {
					System.out.println(3 + " " + point[2]);
				}
				
				if(count[1]==count[2]) {
					if(count[4]>count[5]) {
						System.out.println(2 + " " + point[1]);
					}
					if(count[4]<count[5]) {
						System.out.println(3 + " " + point[2]);
					}
					
					if(count[4]==count[5]) {
						System.out.println(0 + " " + point[2]);
					}
				}
			}			
		}
		
		//투표가 3개가 같을 경우
		int a = Math.max(Math.max(count[0], count[1]), count[2]);
				
		if(best==3) {
			if(a==count[0] && a!=count[1] && a!=count[2]) {
				System.out.println(1 + " " + point[0]);
			}
			
			if(a==count[1] && a!=count[0] && a!=count[2]) {
				System.out.println(2 + " " + point[1]);
			}
			
			if(a==count[2] && a!=count[0] && a!=count[1]) {
				System.out.println(3 + " " + point[2]);
			}
			
			if(a==count[0] && a==count[1] && a==count[2]) {
				System.out.println(0 + " " + point[0]);
			}
		}
		
		
		scan.close();
	}

}
