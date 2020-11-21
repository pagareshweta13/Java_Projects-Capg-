package com.capgemini.lab5.client;

import java.util.Scanner;

import com.capgemini.lab5.service.NameException;

public class NameTester {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			System.out.println("Enter your Firstname: ");
			String firstName= scanner.nextLine();
			
			System.out.println("Enter your Lastname: ");
			String lastName= scanner.nextLine();
			
			if(firstName.isEmpty() || lastName.isEmpty()) {
				throw new NameException("??? Firstname or Lastname Field Not filled ???");
			}
			System.out.println("!!! Successfully Updated Firstname and Lastname !!!");

		}catch(NameException e) {
			e.printStackTrace();
		}

	}

}
