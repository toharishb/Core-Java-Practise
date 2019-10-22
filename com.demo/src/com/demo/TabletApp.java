package com.demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class TabletApp {

/*- Create a class Tablet with properties name and expiry date. Add some tablet objects to a ArrayList. 
	- Get the names of Tablet in a List, Which are expiring within 3 months from today?
	- Create a List of Tablet objects, in the ascending order of expiry date?
*/
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		DateTimeFormatter  objSDF = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		ArrayList<Tablet> tabletList=new ArrayList<Tablet>();
		tabletList.add(new Tablet("Paracetamol",LocalDate.parse("12-09-2019",objSDF)));
		tabletList.add(new Tablet("Paracetamol1",LocalDate.parse("12-10-2019",objSDF)));
		tabletList.add(new Tablet("Paracetamol2",LocalDate.parse("12-11-2018",objSDF)));
		tabletList.add(new Tablet("Paracetamol3",LocalDate.parse("12-12-2019",objSDF)));
		tabletList.add(new Tablet("Paracetamol4",LocalDate.parse("12-01-2021",objSDF)));
		List<String> namesList=tabletList.stream().filter(t->t.getExpiryDate().isBefore(LocalDate.now().plusMonths(3))).map(t->t.getName()).collect(Collectors.toList());
		//*************************************Names List************************************
		namesList.forEach(System.out::println);
		
		//*************************************Sorted List************************************

		
		
		Collections.sort(tabletList);
		tabletList.forEach(t->System.out.println(t.getExpiryDate()));
	}

}
