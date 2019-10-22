package com.demo;

import java.util.Arrays;
import java.util.Collections;

public class ArrayFunction {
	
	public static void main(String[] args) {
		
		int[] arr= {56,87,46,89,78};
		int[]finalArray=new int[5];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				finalArray[j]=arr[i];
				j++;
			}
		}
		
		Arrays.sort(finalArray);
		int[] result=new int[2];
		for(int i=0;i<2;i++) {
			result[i]=finalArray[i];
		}
		for(int i=0;i<2;i++) {
			System.out.println(result[i]);
		}
	}

}
