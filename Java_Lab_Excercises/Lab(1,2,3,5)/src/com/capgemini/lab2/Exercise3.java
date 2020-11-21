package com.capgemini.lab2;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the elemnt in array :\n");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		
		System.out.println("The element of array:");
		display(a,n);
		
		
		int b[] = reverseElement(a,n);
		System.out.println("\nArray element after reversing:");
		for(int i=0;i<n;i++) {
			System.out.print(b[i]+"  ");
		}
		Arrays.sort(b);
		//display(b,n);
		/*  sorting another way
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(b[i] < b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		
		*/
		
		
		System.out.println("\nThe element of array after process:");
		display(b,n);
		
	}

	public static int[] reverseElement(int[] a, int n) {
		
		int c[] = new int[n];
		
		for(int i=0,k=0;i<n;i++) {
			int x = a[i];
			int num = 0;
			while(x!=0) {
				num = num*10 + x%10 ;
				x=x/10;
			}
			//System.out.println(num);
			c[k] = num;
			k++;
		}
		
		return c;
	}

	public static void display(int a[],int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+"  ");
		}
	}

}