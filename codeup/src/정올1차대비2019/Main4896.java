package 정올1차대비2019;

import java.util.Scanner;

public class Main4896 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 
		 int[] box1 = new int[4];
		 int[] box2 = new int[4];
		 
		 for(int i=0; i<4; i++) {
			 box1[i] = scan.nextInt();
		 }
		 
		 for(int i=0; i<4; i++) {
			 box2[i] = scan.nextInt();
		 }
		 
		 int count = 0;
		 String answer = "";
		 if((box1[0]==box2[2] && box1[3]==box2[1]) || (box1[2]==box2[0] && box1[3]==box2[1]) ||
				 (box1[0]==box2[2] && box1[1]==box2[3]) || (box1[2]==box2[0] && box1[1]==box2[3])) {
			 System.out.println("POINT");
		 }
		 else {
			count++;
		 }
		 

		 if((box1[2]<box2[0] && box1[0]<box2[0]) || (box1[3]<box2[1] && box1[1]<box2[1]) ||
				 (box2[1]<box1[1] && box2[3]<box1[1]) || (box2[2]<box1[0] && box2[2]<box1[2])) {
			 System.out.println("NULL");
		 }
		 else {
			count++;
		 }
		 
		 if( ((box1[2]==box2[0] && box2[1]<box1[3] && box1[1]<box2[3]) ||
				 (box1[0]==box2[2] && box2[1]<box1[3] && box1[1]<box2[3]) ||
				 (box1[3]==box2[1] && box2[0]<box1[2] && box1[0]<box2[2]) ||
				 (box1[1]==box2[3] && box2[0]<box1[2] && box1[0]<box2[2]))) {
			 answer = "LINE";
			 
		 }
		 else {
			count++;
		 }
		 

		 
		 if(count==3) {
			 System.out.println("FACE");
		 }
		 
		 System.out.println(answer);
		 
		 scan.close();
	}

}
