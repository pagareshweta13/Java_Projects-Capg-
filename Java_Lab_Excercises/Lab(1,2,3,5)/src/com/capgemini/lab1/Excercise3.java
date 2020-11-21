package com.capgemini.lab1;

import java.util.Scanner;

public class Excercise3 {

	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int a=1;int b=1;
		int n=sc.nextInt();
		int c=0;
		System.out.println(nonRecursiveFib(a,b,c,n));
		recursiveFib(a,b,c,n);

	}
	public  static void  recursiveFib(int a, int b, int c, int n) {
		
		if(n-2>0)
		{
			c=a+b;
			a=b;
			b=c;
			 recursiveFib(a, b, c, n-1);
			 return;
			
		}
	 System.out.println(c);
		
		
	}
	public static int nonRecursiveFib(int a, int b, int c, int n) {
	
		for(int i=1;i<=n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			
			
		}
		return c;
		
		
	}

}
