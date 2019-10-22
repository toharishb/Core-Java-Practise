package com.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class MaxNumber {
	/*Given  an  array  of  numbers,  arrange  them  in  a  way  that  yields  the  largest  value.  For  example,  if  the  given
	numbers  are  {54,  546,  548,  60},  the  arrangement  6054854654  gives  the  largest  value.
	input:
	First  line  contains  an  integer  N   ,  Next  line  contains  N   integers  separated  by  space.
	output:
	Print  the  maximum  number  that  can  be  obtained  by  using  given  numbers.
	Constraints:
	1<=N<=1000
	1<=Number<=1000000*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String[] input=new String[N];
		for(int i=0;i<N;i++){
			input[i]=br.readLine();
		}
		
		Arrays.sort(input);
		int i;
	//	String result=maxNumber(input);
		//System.out.println(result);

	}
	
	public static String maxNumber(int[] input){
		String result="";
		for(int i=input.length-2;i>0;i--){
			if(Integer.parseInt(String.valueOf(input[i])+String.valueOf(input[i+1]))>Integer.parseInt(String.valueOf(input[i+1])+String.valueOf(input[i]))){
				result=result+String.valueOf(input[i])+String.valueOf(input[i+1]);
			}
			else
				result=result+String.valueOf(input[i+1])+String.valueOf(input[i]);
			i--;
		}
		
		
		return result;
		
	}

}
