package com.capgemini.lab1;
import java.util.*;
public class Excersice6 {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int n=sc.nextInt();
		long sum=calculateDiffrence(n);
		System.out.println("Sum"+sum);
	  
		
	}
	public static long calculateDiffrence(int n) {
		long sum=0;
		int res1=0;
		int res2=0;
		for(int i=1;i<=n;i++)
		{
		  res1+=i*i;
		  res2+=i;
		}
		sum=res1-(res2*res2);
		return sum;
	
	
	}

}
