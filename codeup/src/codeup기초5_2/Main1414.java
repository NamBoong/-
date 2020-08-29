package codeup기초5_2;

import java.util.Scanner;

public class Main1414 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		a = a.replaceAll("C", "c");
		int[] b = new int[a.length()];
		int count1 = 0;
		int count2 = 0;

		
		for(int x=0; x<a.length(); x++) {
			b[x] = a.charAt(x);
		 		if(b[x]==99) {
				count1++;
		 		}
		}
		System.out.println(count1);
		
		
		for(int x=0; x<a.length(); x++) {
		if(x+1<a.length()) {
		//이부분에서 힘들었다... 배열이 원래의 범위를 넘어서서 그 부분 제어를 못찾겠어서 길이보다 작다는 전제조건을 하나 더 넣어주었다.
		if(b[x]==99 && b[x+1]==99) {

			count2++;
		
		}
		}

		}
		System.out.println(count2);
		scan.close();
	}

}
