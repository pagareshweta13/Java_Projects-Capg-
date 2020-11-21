package com.capgemini.lab1;

import java.util.Scanner;

public class Excercise1 {
	
	public static int  sumCubesOfDigits(int n) {
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			sum+=(digit*digit*digit);
			n=n/10;
			
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=sumCubesOfDigits(n);
		System.out.println("Sum Of Cubes Of Digit"+sum);
		
	}


}
