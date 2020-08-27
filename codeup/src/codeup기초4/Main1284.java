package codeup기초4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1284 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		//2개의 크기가 변형이 가능한 배열 2개를 만들어준다.
		
		for(int i=2; i<a; i++) {
		// i를 1부터 나누면 당연히 나머지가 0이 나오기에 2부터해서 1번 배열에 추가를 해준다.
			if(a%i==0) {
				arr1.add(i);
			}
		}
		if(arr1.size()==2) {
		// 1번 배열에 추가한 숫자의 크기가 2라면(숫자 1개는 크기가 2이다)
			for(int i=1; i<=arr1.get(0); i++) {
				if(arr1.get(0)%i==0) {
					arr2.add(i);
					// 오름차순 순서로 정리하기위해 add를 쓴다. 3과 7이 나왔을때 7이 더 크니깐 add(7)이 되면 먼저 구해져도 뒤에 놓인다.
				}
			}
			for(int i=1; i<=arr1.get(1); i++) {
				if(arr1.get(1)%i==0) {
					arr2.add(i);
					// 2번째로 얻은 수를 마찬가지로 오름차순으로 정리시켜 준다.
				}
			}
		if(arr2.size()==4) {
			//숫자가 2개면 크기도 2+2로 4가 된다.
			System.out.printf(arr1.get(0)+" "+arr1.get(1));
			//이제 첫번째 얻은 숫자 그리고 두번째 얻은 숫자를 써주고 나머지는 모두 wrong number로 놓는다.
		}
		else {
			System.out.printf("wrong number");
		}
		}
		else {
			System.out.printf("wrong number");
		}
		scan.close();
	}
}
