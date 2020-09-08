package 정올1번수준문제;

import java.util.Scanner;

public class Main4651 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[12];
		
		for(int i=0; i<12; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for(int i=0; i<4; i++) {
			if(arr[i]==0) {
				count1++;
			}
		}
		
		for(int i=4; i<8; i++) {
			if(arr[i]==0) {
				count2++;
			}
		}
		
		for(int i=8; i<12; i++) {
			if(arr[i]==0) {
				count3++;
			}
		}
		
		String answer1 = "";
		switch(count1){
			case 1 : answer1 = "A";
			break;
			case 2 : answer1 = "B";
			break;
			case 3 : answer1 = "C";
			break;
			case 4 : answer1 = "D";
			break;
			case 0 : answer1 = "E";
			break;
		}		
		System.out.println(answer1);
		
		String answer2 = "";
		switch(count2){
			case 1 : answer2 = "A";
			break;
			case 2 : answer2 = "B";
			break;
			case 3 : answer2 = "C";
			break;
			case 4 : answer2 = "D";
			break;
			case 0 : answer2 = "E";
			break;
		}		
		System.out.println(answer2);		
		
		String answer3 = "";
		switch(count3){
			case 1 : answer3 = "A";
			break;
			case 2 : answer3 = "B";
			break;
			case 3 : answer3 = "C";
			break;
			case 4 : answer3 = "D";
			break;
			case 0 : answer3 = "E";
			break;
		}		
		System.out.println(answer3);
		
		scan.close();
	}

}
