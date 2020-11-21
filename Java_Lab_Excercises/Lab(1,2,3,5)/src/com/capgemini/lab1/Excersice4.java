package com.capgemini.lab1;

import java.util.Scanner;

public class Excersice4 {

	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int flag=0;
		for(int i=1;i<=n;i++) {
			int b=2;
			flag=0;
			while(b<=i/2)
			{
				if(i%b==0)
				{
					flag=1;
					break;
				}
				b++;
			
			}
			if(flag==0)
				System.out.println(i);
			
		}

	}

}
