package 구조체연습;

import java.util.Scanner;

public class Main3170 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		String[] arr = new String[n*2];		
		for(int i=0; i<n*2; i++) {
			arr[i] = scan.next();
		}
		
		String[] quest = new String[m];
		for(int i=0; i<m; i++) {
			quest[i] = scan.next();
		}
		
		int num = 0;
		int sum = 0;
		while(num<m) {
			for(int i=0; i<n*2; i++) {
				if(i%2==0) {
				if(arr[i].contains(quest[num])) {
					sum = sum + Integer.parseInt(arr[i+1]);
				}
				}
			}	
			if(sum!=0) {
				System.out.println(sum);
			}
			if(sum==0) {
				System.out.println(0);
			}
			num++;
			sum = 0;
		}
		
		scan.close();
	}

}

// 시간초과가뜨나 답은 제대로 나옴