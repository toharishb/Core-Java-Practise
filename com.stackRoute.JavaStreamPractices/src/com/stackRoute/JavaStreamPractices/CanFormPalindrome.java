package com.stackRoute.JavaStreamPractices;

import java.util.ArrayList;
import java.util.List;

public class CanFormPalindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result=canFormPalindrome("malayalam");
		if(result)
			System.out.println("can Form");
		

	}
	
	public static boolean canFormPalindrome(String str){
		
		boolean result=false;
		
		List<String> al=new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			if(al.contains(""+str.charAt(i)))
				al.remove(""+str.charAt(i));
			else
				al.add(""+str.charAt(i));
		}
		
		if((str.length()%2==0&&al.size()==0)||(str.length()%2==1&&al.size()==1))
			return true;
		else
			return false;
				
	}

}
