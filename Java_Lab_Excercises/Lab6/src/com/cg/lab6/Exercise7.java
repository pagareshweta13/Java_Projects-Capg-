package com.cg.lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
		static private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		
		Integer n[] = new Integer[size];
		for(int i=0;i<size;i++) {
			n[i] = sc.nextInt();
		}
		
		int x[] = getSorted(n);
		System.out.println("\n\n------------------------------------");
		System.out.println("Array after reversing each number and sorting :");
		for(int c : x) {
			System.out.println(c);
		}
		
	}
	private static int[] getSorted(Integer[] n) {
		 
		
		System.out.println("Array before :");
		for(Integer a : n) {
			System.out.print(a+" ");
		}
		
		
		String [] reverseNumbers = new String[n.length]; 
		 
	        for(int i=0;i<n.length;i++) {
	            reverseNumbers[i]= n[i].toString();
	            StringBuffer sb= new StringBuffer(reverseNumbers[i]);
	            reverseNumbers[i]=sb.reverse().toString();
	            n[i]= Integer.parseInt(reverseNumbers[i]);

	        } 
	        
	        System.out.println("\n\nArray after :");
			for(Integer a : n) {
				System.out.print(a+"       ");
			}
			
	        List<Integer>list = Arrays.asList(n);
	        System.out.println("\n\nArray to list conversion");
	        System.out.println(list);
	        
	        Collections.sort(list);
	        
	        System.out.println("\n\nAfter sorting list :");
	        System.out.println(list);
	        
	        int l[] = new int[n.length];
	        int k=0;
	        for(Integer it : list) {
	        	l[k] =  it.intValue();
	        	k++;
	        }

		
		return l;
	}

}