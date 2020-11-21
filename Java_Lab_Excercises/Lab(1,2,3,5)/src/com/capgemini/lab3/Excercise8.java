package com.capgemini.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise8 {
	public static boolean isAlphabetic(String s)
	{
		char c[]=s.toCharArray();
		Arrays.sort(c);
		for(int i=0;i<s.length();i++)
		{
			if(c[i]!=s.charAt(i))
				return false;
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
	    if(isAlphabetic(s))
	    	System.out.println("String is in alphabetic order");
	    else
	    	System.out.println("String is not in alphabetic order");
		
		
	}

}
