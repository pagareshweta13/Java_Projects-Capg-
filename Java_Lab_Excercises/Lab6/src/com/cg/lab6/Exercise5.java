package com.cg.lab6;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
		static private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the size of integer array :");
		int size =sc.nextInt();
		Integer n[] = new Integer[size];
		
		System.out.println("Enter the array elements :");
		for(int i=0;i<size;i++) {
			n[i] = sc.nextInt();
		}
		
		Integer x = getSecondSmallest(n);
		System.out.println("--------------------------------");
		System.out.println("Second Smallest number : "+x);
		
	}
	private static Integer getSecondSmallest(Integer[] n) {
        List<Integer> list = Arrays.asList(n);
        System.out.println("------list before sorting--------");
        System.out.println(list);
        
        Collections.sort(list);
        System.out.println("----------list after sorting----------");
		System.out.println(list);
		
		int x = list.get(1).intValue();
		return x;
	}

}