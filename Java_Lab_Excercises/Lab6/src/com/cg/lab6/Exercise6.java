package com.cg.lab6;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise6 {
		static private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(1, 16);
		map.put(2, 34);
		map.put(3, 25);
		map.put(5, 18);
		System.out.println("-----Candidate record---------");
		System.out.println("Id    Age");
		for(Map.Entry<Integer, Integer>m : map.entrySet()) {
			System.out.println(m.getKey()+"     "+m.getValue());
		}
		System.out.println("\n");
		
		List<Integer> list = voterList(map);
		System.out.println("---------------------------------------");
		System.out.println("Candidate eligible list for voting :: ");
		System.out.println(list);
		System.out.println("----------------------------------------");

	}

	private static List<Integer> voterList(HashMap<Integer, Integer> map) {
		List<Integer> list = new ArrayList<>();
		int i=0;
		for(Map.Entry<Integer,Integer> m : map.entrySet()) {
			if(m.getValue()>=18) {
				list.add(i, m.getKey());
				i++;
			}
		}

		return list;
	}

}