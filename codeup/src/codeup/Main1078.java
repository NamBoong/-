package codeup;

import java.util.Scanner;

public class Main1078 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int value1 = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<=value1; i++) {
			if(i%2==0) {
				// i가 짝수로 나머지 없이 떨어지는 경우에만 수를 더하는 조건을 달아준다.
				sum += i;
			}
		}
		System.out.println(sum);
		// 조건문이 다 끝나고나서 출력을하면 값이 더해진다.
		scan.close();
	}

}
// 참고로 나는 8을 입력했을때 왜 20이 나오는지 진지하게 30분 넘게 고민했다. 2 4 6 8을 못더해서....