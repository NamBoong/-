package codeup√÷±Ÿ100¡¶;

import java.util.Scanner;

public class Main1661 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		
		String b = a.replaceAll(" ", "");
		String c = b.replaceAll(",", " ");
		String d = c.replaceAll(";", "\n");
		
		System.out.println(d);
		
		scan.close();
	}

}
