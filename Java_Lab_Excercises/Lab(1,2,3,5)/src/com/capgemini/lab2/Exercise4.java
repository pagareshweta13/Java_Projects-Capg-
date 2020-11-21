package com.capgemini.lab2;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the size of array :");
	       int size = sc.nextInt();
	       
	       int a[] = new int[size];
	       for(int i=0;i<size;i++) {
	    	   a[i] = sc.nextInt();
	       }
	       
	       Exercise4 obj = new Exercise4();
	       int a1[] = obj.modifyArray(a);
           
	       System.out.println("Sorted in ascending order :\n");
	       for(int i=0;i<a1.length;i++) {
	    	   System.out.print(" "+a1[i]);
	       }
	}

	public int[] modifyArray(int[] a) {
		// TODO Auto-generated method stub
		int k =1;
		int flag=0;
		
		//remove duplicate element
		int b[] = new int[a.length];
		b[0] = a[0];
		for(int i=1;i<a.length;i++) {
			flag=0;
			for(int l=0;l<k;l++) {
				if(a[i]==b[l]) {
					flag=1;
					break;
				}
				else {
					flag=0;
				}
			}
			
			if(flag==0) {
				b[k]=a[i];
				k++;
			}
			
		}
		
		//sorting array
		int temp=0;
		for(int i=0;i<k-1;i++) {
			for(int j=i+1;j<k;j++) {
				if(b[i] > b[j]) {
				    temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		
		//copying b array into c to avoid arrayoutofbound exception
		int c[] = new int[k];
		System.out.println("Array after removing duplicate :\n");
		for(int i=0;i<k;i++) {
			System.out.print("  "+b[i]);
			c[i] = b[i];
		}
		System.out.println();
		
		
		return c;
	}

}