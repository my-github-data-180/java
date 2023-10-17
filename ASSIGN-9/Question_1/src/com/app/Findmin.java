package com.app;

import java.util.Arrays;

public class Findmin {

	  public static <T extends Number> T  findMin(T [] arr) {
		  T min=arr[0];
		  for(int i=1 ;i<arr.length;i++) {
			  if (min.doubleValue()>arr[i].doubleValue())
				  min=arr[i];
		  }
		  return min;
		  
		  
		  
		  
	  }
	public static void main(String[] args) {
		Integer[] arr1 = {66,22,55,88,99};
		Integer min1 = findMin(arr1);
		System.out.println("minimum ="+min1);
		
		Double[] arr2 = {52.35 , 25.36 , 25.63};
		Double min2 =findMin(arr2);
		System.out.println("minimum ="+min2);
		
		
	}

}
