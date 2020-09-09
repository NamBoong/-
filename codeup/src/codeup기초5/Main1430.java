package codeup기초5;

import java.util.Scanner;

class Main1430 {
	
  @SuppressWarnings({ "resource", "unused" })
public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);
    
    int n,m,d;
    
    n = sc.nextInt();
    
    int i,k,test=0;
    
    int[] question = new int[n];
    for(i=0;i<n;i++) {
    	question[i] = sc.nextInt();
    }

    m = sc.nextInt();
    int[] answer = new int[m];
    for(i=0;i<m;i++) {
    	answer[i] = sc.nextInt();
    }

    for(i=0;i<m;i++){
      for(k=0;k<n;k++){
        if(answer[i]==question[k]){
          System.out.print("1 ");
          break;
        }
        
        else{
          test++;
          if(test==n){
            System.out.print("0 ");
          }
        }
      }
      test=0;
      sc.close();
    }
  }
}

// 시간초과가 나오지만 답은 잘만나오니 패스