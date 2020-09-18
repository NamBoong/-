package codeup기초5_3;

import java.util.Scanner;

public class Main1509 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[11][10];
		
		for(int i=0; i<11; i++) {
			for(int j=0; j<10; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int width = 0;
		int count = 0;		

		while(width<10) {
			
			if(arr[10][width]==1) {					
				for(int i=9; i>=0; i--) {
					
					if(arr[i][width]==0) {
						count++;
						if(count==10) {
							System.out.println((width+1) + " safe");
							width++;
							count=0;
							if(width+1==11) {
								break;
							}
						}						
					}
					
					if(arr[i][width]>=1 || (arr[9][width]>=1 && arr[10][width]==1)) {
						System.out.println((width+1) + " crash");
						width++;
						count=0;
						if(width+1==11) {
							break;
						}
					}
					
					if(arr[i][width]<0 || (arr[9][width]<0 && arr[10][width]==1)) {
						System.out.println((width+1) + " fall");
						width++;
						count=0;
						if(width+1==11) {
							break;
						}
					}
				

					
				if(arr[10][width]==0) {
					width++;
				}
					
					
									
				}
			}
		}
			
		scan.close();
		
	}

}

//특별 케이스들이 crash가 fall로 나오고있다....
//억지로 9번열에 추가 조건을 붙였다.