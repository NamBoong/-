package codeup;

public class Main1001{

	public static void main(String[] args) {
		System.out.println("Hello");

	}

}


public class Main1002 {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
	}

}

public class Main1003 {

	public static void main(String[] args) {

		System.out.println("Hello \nWorld");
		
	}

}

public class Main1004 {

	public static void main(String[] args) {

		System.out.println("\'Hello\'");
		
	}

}

public class Main1005 {

	public static void main(String[] args) {

		System.out.println("\"Hello World\"");
		
	}

}

public class Main1006 {

	public static void main(String[] args) {

		System.out.println("\"!@#$%^&*()\"");
		
	}

}

public class Main1007 {

	public static void main(String[] args) {

		System.out.println("\"C:\\Download\\hello.cpp\"");
	}

}

public class Main1008 {

	public static void main(String[] args) {

		System.out.println("\u250C\u252C\u2510");
		System.out.println("\u251c\u253c\u2524");
		System.out.println("\u2514\u2534\u2518");
	}

}

import java.util.Scanner;

public class Main1010 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(b);
		
				
		

	}

}

import java.util.Scanner;

public class Main1011 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String value1 = scan.next();
		
		
		scan.close();
		
		System.out.println(value1);
		
		
		
		
	}

}

import java.util.Scanner;

public class Main1012 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		Double value1 = scan.nextDouble();
		
		
		scan.close();
		
		System.out.println(String.format("%.6f", value1));
		
		
		
	}

}
