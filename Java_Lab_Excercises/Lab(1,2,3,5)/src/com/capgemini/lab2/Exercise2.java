package com.capgemini.lab2;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	private static Scanner scanner  = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// accept number of students
				System.out.println("Enter number of students: ");
//				int size= scanner.nextInt();	
//				scanner.nextLine();//dummy nextLine method to clear KBD buffer
				
				int size = Integer.parseInt(scanner.nextLine());
				int n =size;
				//allocate memory
				String names[]= new String[size];
				
				//accept names
				getName(names);
				
				//display names
				showArray(names);
				
				//sort names
				Arrays.sort(names);
				
				
				
				int cnt = 0;
				if(cnt%2==0) {
					cnt = n/2;
				}
				else{
					cnt = (n/2)+1;
				}
				
				
				//display names
				System.out.println("After sorting..");
				for(String s: names) {
					System.out.println(s);
				}
				
				
				System.out.println("\nAfter performing uppercase lowercase operations :\n");
				for(int i=0;i<n;i++) {
					if(i<=cnt) {
						System.out.print(names[i].toUpperCase()+" ");
					}
					else {
						System.out.print(names[i].toLowerCase()+" ");
					}
				}

	}
	public static void getName(String[] names) {
		//Accept names
		for(int i=0;i<names.length;i++) {
			System.out.println("Enter name student: "+(i+1));
			names[i]= scanner.nextLine();			
		}
	}
	
	public static void showArray(String[] names) {
		System.out.println("Before sorting..");
		for(String s: names) {
			System.out.println(s);
		}
	}

}