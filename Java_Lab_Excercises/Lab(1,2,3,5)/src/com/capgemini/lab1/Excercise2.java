package com.capgemini.lab1;

public class Excercise2 {

	public static void main(String[] args) {
		String input=args[0];
		
		switch(input)
		{
		case "RED":System.out.println("STOP");
		           break;
		case "YELLOW":System.out.println("READY");
		              break;
		case "GREEN":System.out.println("GO");
		             break;
		default:System.out.println("Invalid Input");
		             break;
		}

	}
}
