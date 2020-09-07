package 정올1번수준문제;

import java.util.Scanner;

public class Main4036 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		for(int i=2; i<=1000000; i++) {
			for(int j=0; j<=999998; j++) {
				if(i+j==n && i-j==m) {
					System.out.println(i);
					System.out.println(j);
					break;
				}
			}
		}
		scan.close();
	}

}
// 범위가 너무 커서 시간 초과로 나온다. 그러나 범위를 줄이면 테스트 케이스에서 막혀버리기에 사실상 시간초과가 안나오기 힘들것 같다ㅠㅠ