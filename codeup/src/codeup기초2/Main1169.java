package codeup±âÃÊ2;

	import java.util.Scanner;

	public class Main1169 {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			int a = scan.nextInt();
			
			if((2012-a+1)>=2000) {
			System.out.println((2012-a+1)-2000 + " " + 3);
			}
			else {
				System.out.println((2012-a+1)-1900 + " " + 1);
			}
			scan.close();
		}

	}
