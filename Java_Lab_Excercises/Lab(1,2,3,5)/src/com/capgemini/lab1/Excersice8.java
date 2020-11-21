package com.capgemini.lab1;

import java.util.Scanner;

public class Excersice8 {
	
	public static boolean isPowerOfTwo(int n) {
	    return n>0 && n==Math.pow(2, Math.round(Math.log(n)/Math.log(2)));
	}
	
	public static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Enter number");
		int n=sc.nextInt();
		if(isPowerOfTwo(n))
		System.out.println(n+" is power of 2 ");
		else
		System.out.println(n+" is not power of 2 ");

		
		
		
		
	}

}
