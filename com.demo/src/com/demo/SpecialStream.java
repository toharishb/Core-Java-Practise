package com.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecialStream {

	/*
	### Special Streams
	- Use IntStream to generate a range of numbers from 20 to 50 inclusive. From the stream,
	 store the square of odd multiples of 3
	  in an LinkedList
	- Generate a infinite stream with multiples of 5 and collect the first 20 multiples in an array.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> range = IntStream.rangeClosed(20, 50)
			    .boxed().collect(Collectors.toList());
		
		
		System.out.println(range);
		
		LinkedList<Integer> ll=(LinkedList<Integer>) range.parallelStream().filter(a->(a%3==0&&a%2==1)).map(a->a*a).collect(Collectors.toCollection(LinkedList::new));
		
		System.out.println(ll);
		
		//int[] arrayWith5Multiples=IntStream.ran
	}

}
