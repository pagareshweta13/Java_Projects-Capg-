package com.capgemini.lab2;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array :");
       int size = sc.nextInt();
       
       int a[] = new int[size];
       for(int i=0;i<size;i++) {
    	   a[i] = sc.nextInt();
       }
       
       Exercise1 obj = new Exercise1();
       int n1 = obj.getSecondSmallest(a);
       System.out.println("\nSecond Smallest Number From Array Is : "+n1);
	}

	private int getSecondSmallest(int[] a) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] > a[j]) {
				    temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print("  "+a[i]);
		}
		
		return a[a.length-2];
	}

}