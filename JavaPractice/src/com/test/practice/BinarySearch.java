package com.test.practice;

public class BinarySearch {
	
	
	
	public static void binarySearch(int[] arr,int value)
	{
		int start = 0;
		int end = arr.length-1; 
	    int middle =(int) Math.floor((start+end)/2);
	
		while(arr[middle]!=value)
		{
			if (value<arr[middle] ) {
			      end = middle-1;
			}
			else
			{
				start = middle+1;
				
			}
			
			middle =(int) Math.floor((start+end)/2);
		}
		
	System.out.print(middle);	
	
	}

	public static void main(String[] args) {
		
		
		int[] arr = {2,5,6,9,13,28,30};
		
	BinarySearch.binarySearch(arr, 30);	
		

	}

}
