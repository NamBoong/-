package codeup±‚√ 2;

import java.util.Scanner;

public class Main1226 {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	    
	    int[] lottos = new int[6];
	    int[] jhlottos = new int[6];
	    
	    
	    int x = 0;
	    int count = 0;
	    
	    for(int i = 0; i < lottos.length; i++) {
	      int a = scan.nextInt();
	      lottos[i] = a;
	    }
	    int bonus = scan.nextInt();
	    int z = bonus;

	    for(int i = 0; i < jhlottos.length; i++) {
	      int b = scan.nextInt();
	      jhlottos[i] = b;
	    }

	    for(int i = 0; i < lottos.length; i++) {
	      for(int j = 0; j < jhlottos.length; j++) {
	        if(lottos[i] == jhlottos[j]) {
	          count++;
	        }
	      }
	    scan.close();  
	      if(jhlottos[i] == z){
	        x = 1;
	      }      
	    }
	    if( count == 6){
	      System.out.println("1");
	    }
	    else if( count == 5 && x == 1 ){
	      System.out.println("2");
	    }
	    else if( count == 5){
	      System.out.println("3");
	    }
	    else if( count == 4){
	      System.out.println("4");
	    }
	    else if( count == 3){
	      System.out.println("5");
	    }
	    else {
	      System.out.println("0");
	    }
}
}