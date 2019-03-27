package com.test.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FindNumber {



    // Complete the findNumber function below.
    static String findNumber(List<Integer> arr, int k) {
      
    	int size = arr.size();
    	System.out.println(size);
    	System.out.println(k);
    	
    	Iterator<Integer> itr = arr.iterator();
    	while(itr.hasNext())
    	{
    		Integer value = itr.next();
    		
    		if(value == k)
    		{
    			return "YES";
    		}
    		
    		
    		
    	}
        return "NO";
    }

    public static void main(String[] args) throws IOException {
     
    	 List<Integer> arr = Arrays.asList(1,5,2);
    	int k = 5;
        String res = findNumber(arr, k);
  System.out.println(res);
     
    }
}
