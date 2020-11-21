package com.capgemini.lab3;

import java.util.Scanner;

public class Excercise3 {
	public static String alterString(char[] cs)
	{
		for(int i=0;i<cs.length;i++)
		{
	        
	        if(cs[i]!='a' && cs[i]!='e'&& cs[i]!='i'&& cs[i]!='o'&& cs[i]!='u'
	        		&& cs[i]!='A'&& cs[i]!='E'&& cs[i]!='I'&& cs[i]!='O'&& cs[i]!='U')
	        {
	          cs[i]=(char) (cs[i]+1);	
	        }
	        
	        
		}
		return String.valueOf(cs);
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res=alterString(str.toCharArray());
		System.out.println(res);
		
	}

}
