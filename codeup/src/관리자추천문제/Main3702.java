package 관리자추천문제;

import java.math.BigInteger;
import java.util.Scanner;

public class Main3702 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int c = scan.nextInt();
		
		BigInteger[][] arr = new BigInteger[50][50];
		
		for(int i=0; i<50; i++) {
			arr[i][0] = new BigInteger("1");	
			arr[0][i] = new BigInteger("1");
		}
		
		for(int i=1; i<50; i++) {
			for(int j=1; j<50; j++) {
				arr[i][j] = arr[i-1][j].add(arr[i][j-1]);
			}
		}
		
		BigInteger a = new BigInteger("100000000");

		System.out.println(arr[r-1][c-1].remainder(a));
		
		
		scan.close();
		
	}

}
