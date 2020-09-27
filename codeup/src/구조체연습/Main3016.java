package 구조체연습;

import java.util.Scanner;

public class Main3016 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String[] arr = new String[n*4];
		
		for(int i=0; i<n*4; i++) {
			arr[i] = scan.next();
		}
		
		int[] num = new int[n];
		int[] num2 = new int[n];
		int[] num3 = new int[n];
		int person = 0;
		
		
		// 이름 구하기
		for(int i=0; i<n*4; i++) {
			if(i%4==1) {
				num[person] = Integer.parseInt(arr[i]);
				person++;
			}		
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(num[i]<num[j]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		
		// 첫 번째 과목 1등 배열의 위치 찾기
		
		int here = 0;
		for(int i=0; i<n*4; i++) {
			if(i%4==1) {
			if(num[0]==Integer.parseInt(arr[i])) {
				here = i;				
			}
			}
		}
		
		
		// 두 번째 과목 등수 구하기
		
		person = 0;
		
		for(int i=0; i<n*4; i++) {
			if(i%4==2) {
				num2[person] = Integer.parseInt(arr[i]);
				person++;
			}		
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(num2[i]<num2[j]) {
					int temp = num2[j];
					num2[j] = num2[i];
					num2[i] = temp;
				}
			}
		}
		
		int count = 1;
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(arr[here+1])<num2[i]) {
				count++;
			}
		}
		
		
		// 세 번째 과목 등수 구하기
		
		person = 0;
		
		for(int i=0; i<n*4; i++) {
			if(i%4==3) {
				num3[person] = Integer.parseInt(arr[i]);
				person++;
			}		
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(num3[i]<num3[j]) {
					int temp = num3[j];
					num3[j] = num3[i];
					num3[i] = temp;
				}
			}
		}
		
		int count2 = 1;
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(arr[here+2])<num3[i]) {
				count2++;
			}
		}
			

		System.out.printf(arr[here-1] + " " + count + " " + count2);						
		
		scan.close();
		
	}

}
