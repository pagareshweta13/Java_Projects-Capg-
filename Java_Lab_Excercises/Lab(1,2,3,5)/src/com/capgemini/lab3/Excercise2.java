package com.capgemini.lab3;

import java.util.Scanner;

public class Excercise2 {
	public static String getImage(StringBuilder sb)
	{
		
		return sb+"||"+sb.reverse();
	}
	
	public static void main(String[] args) {
	
		String a[]=new String[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextLine();
			StringBuilder sb=new StringBuilder(a[i]);
			String t=getImage(sb);
			System.out.println(t);
			
		}
		//String str=sc.nextLine();
		//StringBuilder sb=new StringBuilder(str);
		//String t=getImage(sb);
		//System.out.println(t);
	}

}
