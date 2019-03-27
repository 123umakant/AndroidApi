package com.test.practice;

public class LinearSearch {

	public static  int  lenearSearch(int[] arr,int value)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if(value==arr[i])
			{
			return i;
			}
			
		}
		return -1;
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr= {2,5,6,9,13,15,28,30};
		
		
		System.out.println(LinearSearch.lenearSearch(arr,6));
		
	}


	

	
}
