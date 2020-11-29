package com.cg.lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Number of elements in array :");
		int size = sc.nextInt();
		System.out.println("Enter the numbers in integer array :");
		
		Integer n[] = new Integer[size];
		for(int i=0;i<size;i++) {
			n[i] = sc.nextInt();
		}
		
		HashMap<Integer,Integer> map = new HashMap<>();
		map = getSquares(n);
		
		System.out.println("Integer - Square Hashmap");
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+" = "+m.getValue());
		}
		
		
		
	}
	private static HashMap<Integer, Integer> getSquares(Integer[] n) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int s = n.length;
		for(int i=0;i<s;i++) {
			Integer x = n[i] * n[i];
			map.put(n[i],x);
		}
		
		return map;
	}

}