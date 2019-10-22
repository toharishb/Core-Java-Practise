package com.stackRoute.JavaStreamPractices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Customer> customerList=new ArrayList<>();
		customerList.add(new Customer("Ram",27,"Male"));
		customerList.add(new Customer("Balaji",28,"Male"));
		customerList.add(new Customer("Sita",24,"Female"));
		customerList.add(new Customer("Geetha",26,"Female"));

		System.out.println("****************Customer Names*******************");
		customerList.stream().map(c->c.getName()).forEach(System.out::println);
		System.out.println("****************customer Names age>25*******************");

		customerList.stream().filter(p->p.getAge()>25).map(c->c.getName()).forEach(System.out::println);
		
		System.out.println("****************customer Names set*******************");

		Set<String> setOfNames=customerList.stream().map(c->c.getName()).collect(Collectors.toSet());

		System.out.println("****************Female customers age*******************");

		System.out.println(customerList.stream().filter(p->p.getGender().equals("Female")).mapToDouble(c->c.getAge()).average());

		System.out.println("****************Customer Names sorted list*******************");
		
		List<String> customerSortedList=customerList.stream().sorted((c1,c2)->c1.getAge()-c2.getAge()).map(c->c.getName()).collect(Collectors.toList());

	
	

		System.out.println("From the List of Customers, Create a map with customer 'name' as key and 'age' as value");
			
		Map<String,Integer> customerMap=customerList.stream().collect(Collectors.toMap(Customer::getName, Customer::getAge));
		
		System.out.println("- Iterate through the map and display the key and value pair, of customers with age greater than 25");

		customerMap.entrySet().forEach(m->System.out.println("Key    "+m.getKey()+"Value    "+m.getValue()));
		
		
		System.out.println("From the List of Customers, Create a Map with key as gender and value as List of Customer objects");

		Map<String,List<Customer>> customerWithgender=customerList.stream().collect(Collectors.groupingBy(Customer::getGender,Collectors.toList()));
		
		System.out.println("From the List of Customers, Create a Map with key as gender and value as List of Customer names");

		Map<String,List<String>> mapData3 = customerList.stream().collect(Collectors.groupingBy(Customer::getGender,Collectors.mapping(Customer::getName, Collectors.toList())));

		
		System.out.println("Create a String as per the below format, with the names of Customers whose age is greater than 25 {name1; name2; ...}\n");
		
		System.out.println(customerList.stream().filter(c->c.getAge()>25).map(c->c.getName()).collect(Collectors.joining("; ")));


		/*System.out.println("**********************************Special Streams****************************************");
		Use IntStream to generate a range of numbers from 20 to 50 inclusive. From the stream, store the square of odd multiples of 3
		  in an LinkedList
		- Generate a infinite stream with multiples of 5 and collect the first 20 multiples in an array.
		
		
		List<Integer> range = IntStream.rangeClosed(20, 50)
			    .boxed().collect(Collectors.toList());
		
		
		System.out.println(range);
		
		LinkedList<Integer> ll=(LinkedList<Integer>) range.parallelStream().filter(a->(a%3==0&&a%2==1)).map(a->a*a).collect(Collectors.toList());
		
		System.out.println(ll);*/

		
		
		
		
		
		


	}

}
