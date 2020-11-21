package com.capgemini.lab3;

import java.util.Scanner;

public class Excercise4 {
	public static Integer modifyNumber(Integer n)
	{

		String str=n.toString();
		
		char ch[]=str.toCharArray();
		
		int a[]=new int[ch.length];
		
		for(int i=0;i<str.length();i++)
		{
			//char t=str.charAt(i);
			
			a[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
		    
		}
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<a.length-1;i++)
		{
			int diff=Math.abs(a[i]-a[i+1]);
			sb.append(diff);
			
		
			
		}
		sb.append(a[a.length-1]);
		String str1=sb.toString();
		Integer res=Integer.parseInt(str1);
	 
		 return res;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer n=sc.nextInt();
		n=modifyNumber(n);
		System.out.println(n);
		
		
		
	}

}
