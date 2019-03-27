package com.test.practice;

//Prime number is a number that is greater than 1 and divided by 1 or itself only.
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int value  =scan.nextInt();
		
		int m = value/2;
		int flag=0;  
		
	     if(value==0 || value ==1)
	     {
	    	 System.out.print("Not a Prime Number");
	     }
	     else {
	    	 
	    for(int i=2;i<=m;i++)
	     {
	    	 if(value%i==0 )
	    	 {
	    		 System.out.print("value is not A prime number");
	    		 flag=1;      
	    	     break;  
	    	 }
	    	
	     }
	     
	    if(flag==0)  { System.out.println(" is prime number"); }  
	     }
		
	}

}
