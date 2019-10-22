package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/*### Date and Time
- Accept the investment date in the format <dd/mm/yyyy> for a Bank fixed deposit using Scanner. 
Print the maturity Date in format <dd-mmm-yyyy>, considering an investment period of 4 years 11 months?

- Given todays date, create a List containing the all the dates of working days for next month?
(considering sat and sun as non-working days) 

- Create a class Tablet with properties name and expiry date. Add some tablet objects to a ArrayList. 
	- Get the names of Tablet in a List, Which are expiring within 3 months from today?
	- Create a List of Tablet objects, in the ascending order of expiry date?*/


public class DateandTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	     	String str = "27/09/2019";	
	     	SimpleDateFormat format1 = new SimpleDateFormat("dd/mm/yyyy");
	      SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
	      Date date = format1.parse(str);
	      Instant instant = Instant.ofEpochMilli(date.getTime());
	      LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
	      LocalDate localDate = localDateTime.toLocalDate();
	      LocalDate afterMaturity=localDate.plusMonths(11).plusYears(4);
	      System.out.println(afterMaturity);
	     
	      //*******************************List With next month days*----------------------------------//
	      
	      LocalDate today=LocalDate.now();
	      
	      Month nextMonth=today.plusMonths(1).getMonth();
	      nextMonth.getValue();
	      
	      //System.out.println(ChronoUnit.DAYS.);
	    		 /* 
	    		  while (startCal.getTimeInMillis() <= endCal.getTimeInMillis()) {
	    			    if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY &&
	    			        startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {

	    			        workDays++;
	    			    }

	    			    startCal.add(Calendar.DAY_OF_MONTH, 1);
	    			}*/
	      
	      
	      
	   
	}

}
