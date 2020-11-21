package com.capgemini.lab1;
import java.util.*;
public class Excersice7 {
public static int in=0;
public static int dec=0;
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter number");
        int n=sc.nextInt();
        boolean result;
        if(n>0)
        {
        	result=checkNumber(n);
        	if(result)
        	{
        		System.out.println(n+" is in increasing order");
        	}
        	else
        	{
        		System.out.println(n+" is not in increasing order");
        	}
        }
        else
        {
        	System.out.println("Invalid number");
        }
        
        
        
        //checkNumber(n);
       /* if(result==true)
        System.out.println("Increasing Order");
        else
        System.out.println("Not in Increasing Order");*/
        
  
	}
	private static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int reverse=0;
		int back=n;
		
		while(n!=0)
		{
			reverse=(reverse*10)+(n%10);
			n=n/10;
		}
		if(back==reverse)
		{
			flag=false;
			//System.out.println("non-order");
			
		}
		//System.out.println(reverse);
		
		int cdigit=reverse%10;
		
		reverse=reverse/10;
		
		//int in=0;
		//int dec=0;
		
		while(reverse!=0)
		{
		
			if(cdigit>reverse%10)
			{
				dec++;
			
				
				
			}
			else if(cdigit<reverse%10)
			{
			    in++;
				
			}
			cdigit=reverse%10;
			reverse=reverse/10;
			
		}
		
		if(in!=0&&dec!=0)
		{
			flag=false;
			//System.out.println("non-order");
		}
		
		
		else if(in!=0&&dec==0)
		{
			flag=true;
			//System.out.println("increasing order");
		}
		else if(dec!=0&&in==0)
		{
			flag=false;
			//System.out.println("decreasing order");
		}
			
		return flag;
		
	}

}
