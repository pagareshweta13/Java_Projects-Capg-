package com.capgemini.lab1;
import java.util.Scanner;
public class Excersice5 {
	public static long CheckSum(int n)
	{
		long sum=0;
		for(int i=1;i<=n;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.err.println("Enter the number");
		int n=sc.nextInt();
		long sum=CheckSum(n);
		System.out.println("Sum "+sum);
	}

}
