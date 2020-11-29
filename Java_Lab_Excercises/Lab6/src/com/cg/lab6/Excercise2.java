package com.cg.lab6;
import java.io.*; 
import java.util.*; 
class Excercise2{ 
	public static void characterCount(char[] strArray) 
	{ 
		HashMap<Character, Integer> charCountMap 
			= new HashMap<Character, Integer>(); 

				for (char c : strArray) { 
			if (charCountMap.containsKey(c)) { 

				charCountMap.put(c, charCountMap.get(c) + 1); 
			} 
			else { 

				charCountMap.put(c, 1); 
			} 
		} 

		
		for (Map.Entry entry : charCountMap.entrySet()) { 
			System.out.println(entry.getKey() + " " + entry.getValue()); 
		} 
	} 

	 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
      String  str=sc.nextLine();
      char[] a=str.toCharArray();
		
		characterCount(a); 
	} 
}