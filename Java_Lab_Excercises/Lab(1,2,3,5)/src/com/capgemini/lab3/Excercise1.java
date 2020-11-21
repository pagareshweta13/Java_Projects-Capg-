package com.capgemini.lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Excercise1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sequence of integer :");
		String str=sc.nextLine();
		StringTokenizer token=new StringTokenizer(str," ");
		int num=0,sum=0;
		System.out.println("Entered integers are");
		while(token.hasMoreTokens())
		{
			String s=token.nextToken();
			num=Integer.parseInt(s);
			System.out.print(num+" ");
			sum+=num;
		}
		System.out.println();
		System.out.println("Sum :"+sum);
	}

}
