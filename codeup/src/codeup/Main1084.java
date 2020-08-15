package codeup;

import java.util.Scanner;

public class Main1084 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int g = scan.nextInt();
		int b = scan.nextInt();
		int i = 0;
		
		for(int x=0; x<r; x++) {
			for(int y=0; y<g; y++) {
				for(int z=0; z<b; z++) {
					System.out.println(x + " " + y + " " + z);
					i++;
				}
			}
		}
		System.out.println(i);
		scan.close();
	}

}

// 코드업에서 주 언어는 C이기에 자바에서 print 출력문은 시간이 오래걸려 시간초과가 나온다고한다.
// 예시 답안과 같게 나왔다면 상심하지말고 맞았다고하고 넘어가자!
