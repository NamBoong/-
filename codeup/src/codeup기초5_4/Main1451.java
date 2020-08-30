package codeup기초5_4;

import java.util.Scanner;

public class Main1451 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		// 크기만큼 배열 스캔받은 for문은 여기서 끝낸다.
		
		for(int j=0; j<n; j++) {
			for(int k=j+1; k<n; k++) {
				
		// for 두개를 생서하는데 후자는 전자를 받아서 1씩 증가하게 한다. 즉 앞의 for가 첫번째 수를 내놓으면 뒤의 for는 두번째 수를 내놓는거다.
				if(arr[j]>arr[k]) {
					int tmep = arr[j];
		// tmep 변수명에서 arr j를 받고 j가 k가 되고 k가 다시 tmep가 되는거다. tmep로 j와 k가 이동하기위해 돌려막기한다고 생각하자.
					arr[j] = arr[k];
					arr[k] = tmep;
				}
		}
		}
		
		for(int a=0; a<n; a++) {
			System.out.println(arr[a]);
		}
		scan.close();
	}

}
