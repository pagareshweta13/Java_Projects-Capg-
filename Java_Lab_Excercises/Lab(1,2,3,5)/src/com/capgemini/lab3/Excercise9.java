package com.capgemini.lab3;



import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import java.util.Scanner;

public class Excercise9 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  
		
		
			System.out.println();
		
		System.out.println("Enter year");
        int year=sc.nextInt();
        
        System.out.println("Enter month");
        int month=sc.nextInt();
        
        System.out.println("Enter day");
        int dayOfMonth=sc.nextInt();
        
		LocalDate pdate=LocalDate.of(year, month, dayOfMonth);
		System.out.println(pdate);
		
		LocalDate now=LocalDate.now();
		System.out.println(now);
		
		Period diff=Period.between(pdate,now);
		
		System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                diff.getYears(), diff.getMonths(), diff.getDays());
}
		//System.out.println(diff.getYears()+" "+diff.getMonths()+" "+diff.getMonths());

    //String str=sc.nextLine();
		
	//SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
	
		//Date pdate=sdf.parse(str);
		//System.out.println(pdate);
		//Date today=new Date();
		//System.out.println(today);
		
		//DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/dd/yyyy");
	    //LocalDate pdate = LocalDate.parse(str, dateFormat);
	
	    //System.out.println(pdate);
	
	}


