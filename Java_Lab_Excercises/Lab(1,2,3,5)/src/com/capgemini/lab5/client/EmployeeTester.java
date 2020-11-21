package com.capgemini.lab5.client;

import java.util.Scanner;

import com.capgemini.lab5.service.EmployeeException;

public class EmployeeTester {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args)  {
		try {
			System.out.println("Enter Salary of Employee: ");
			int salary= scanner.nextInt();
			
			if(salary< 3000) {
				throw new EmployeeException("??? Employee Salary below 3000  ???");
			}
			System.out.println("!!! Employee Salary above 3000 !!!");

		
		}catch(EmployeeException e) {
			e.printStackTrace();
		}

	}

}

/*
public class EmployeeTester {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) throws EmployeeException {
	
			System.out.println("Enter Salary of Employee: ");
			int salary= scanner.nextInt();
			
			if(salary< 3000) {
				throw new EmployeeException("??? Employee Salary below 3000  ???");
			}
			System.out.println("!!! Employee Salary above 3000 !!!");

		

}
*/