package com.test.practice;

import java.util.Scanner;

public class printDiamond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i, k, j;

			
		
		
		
		
		
		
		
		  for(i=1;i<=n;i++) 
		  
		  { 
			  for(j=i;j<n;j++) 

		  { 
			  
			  System.out.print(" "); 
		  
		  
		  }
		  for(j=1;j<=(2*i-1);j++)
		  {
			  System.out.print("*"); 
		 } 
		  
		       System.out.println("");
  }
		  for(i=n;i>=1;i--) 
		  
		  { 
			  for(j=i;j<=n;j++) 
			  { 
				  System.out.print(" ");
				  
			  
			  }
		  for(j=2;j<(2*i-1);j++) 
		  {
			  System.out.print("*");
			  } 
		  System.out.println(""); 
		  }
		  
		  
		  

	}

}
