package codeup√÷±Ÿ100¡¶;

import java.util.Scanner;

public class Main2773 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String m = scan.nextLine();
		String k = m.replaceAll(" ", "");
		
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextLine();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println( "\"" + arr[i].substring(0, 4) + "\",\"" + arr[i].substring(5) + "\",\"" + k + "\",\"" +
								0 + "\",\"\"" + ",\"" + 0 + "\",\"" + 0 + "\"");
		}
		
		scan.close();
		
		
	}

}
