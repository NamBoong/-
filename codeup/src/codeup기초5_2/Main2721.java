package codeup����5_2;

import java.util.Scanner;

public class Main2721 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();
				
		String[] t1 = s1.split("");
		String[] t2 = s2.split("");
		String[] t3 = s3.split("");
		
		for(int i=0; i<s1.length(); i++) {
			String answer1 = t1[i];
		}
		
		for(int j=0; j<s2.length(); j++) {
			String answer2 = t2[j];
		}
		
		for(int k=0; k<s3.length(); k++) {
			String answer3 = t3[k];
		}

		if(t1[s1.length()-1].compareTo(t2[0])==0 && t2[s2.length()-1].compareTo(t3[0])==0) {
			System.out.println("good");
		}
		else {
			System.out.println("bad");
		}
		
		scan.close();
		//���� �Է°��� 
		// turtle
		// error
		// robote
		// �ε� bad�� �����̶�� �������ִ�.... ���� �߸����� ������ �𸣰ڴ�.
	}

}
