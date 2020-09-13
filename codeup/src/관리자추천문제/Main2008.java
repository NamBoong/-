package 관리자추천문제;

import java.util.Scanner;

public class Main2008 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		int[] arr2 = arr.clone();
		int[] arr3 = arr.clone();
		int[] arr4 = arr.clone();
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			arr2[i] = arr[i];
			arr3[i] = arr[i];
			arr4[i] = arr[i];
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>=arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr2[i]<=arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr4[i]==arr4[j]) {
					int temp = arr4[i];
					arr4[i] = arr4[j];
					arr4[j] = temp;
				}
			}
		}
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]==arr3[i]) {
				count1++;
			}
			if(arr2[i]==arr3[i]) {
				count2++;
			}
			if(arr[i]!=arr3[i] && arr2[i]!=arr3[i]) {
				count3++;
			}
			if(i+1<n) {
			if(arr4[i]==arr4[i+1]) {
				count4++;
			}
			}
		}
		
		if(count1==n && count4!=n-1) {
			System.out.println("오름차순");
		}
		if(count2==n && count4!=n-1) {
			System.out.println("내림차순");
		}
		if(count1!=n && count2!=n || count4==n-1) {
			System.out.println("섞임");
		}
		
		
		
		scan.close();
	}

}
