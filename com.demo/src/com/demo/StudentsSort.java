package com.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentsSort {
	
	public static String[] sortStudents(String[] nameArray,int[] percantageArray) {
		
	List<Student> studentList=new ArrayList<>();
	for(int i=0;i<nameArray.length;i++) {
		
		studentList.add(new Student(nameArray[i],percantageArray[i]));
		
	}
		
	/*Collections.sort(studentList, new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			// TODO Auto-generated method stub
			if(s1.getPercentage()-s2.getPercentage()>0)
				return 1;
			else if(s1.getPercentage()-s2.getPercentage()<0)
				return -1;
			else
				return 0;
			
		}
	});*/
	//Collections.sort(studentList, (Student s1, Student s2)->s1.getPercentage()-s2.getPercentage());
	studentList.sort((Student s1, Student s2)->s1.getPercentage()-s2.getPercentage());
		String[] result=new String[studentList.size()];
		for(int i=0;i<studentList.size();i++) {
			result[i]=studentList.get(i).getNames();
		}

		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner s=new Scanner(System.in);
		System.out.println("no of Elements");
		int n=s.nextInt();
		String[] nameArray=new String[n];
		int[] percentagesArray=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter input");
			String str=s.nextLine();
			String[]strArray=str.split(",");
			nameArray[i]=strArray[i].split(":")[0];
			percentagesArray[i]=Integer.parseInt(strArray[i].split(":")[1]);
		}*/
		String[] nameArray={"Rahul","Girish","john"};
		int[] percentagesArray= {75,65,80};
		String[] result=sortStudents(nameArray,percentagesArray);
		System.out.println(Arrays.toString(result));
		/*for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}*/
	}

}
