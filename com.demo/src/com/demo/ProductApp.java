package com.demo;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductApp {
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(
			new Product(111,"Laptop",55000),
			new Product(222,"EarPhones",500),
			new Product(333,"Mobile",35000),
			new Product(444,"MICROOVEN",10000)
		);
		
		
		Collections.sort(productList,Comparator.comparing(Product::getProductPrice));
		productList.forEach(p->{
			if(p.getProductName().startsWith("M"))
			System.out.println(p);
		});
		
		
		
	}
	
	
	

}
