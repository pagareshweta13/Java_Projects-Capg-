package com.capgemini.lab9;

import java.util.Scanner;
import java.util.function.Consumer;

interface space
{
	String spacemethod(String str);
}
public class Excercise2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string ");
	String s = sc.next();
	space s1=(x)->x.replaceAll(".", "$0 ");
	System.out.println("Result:"+s1.spacemethod(s));
		
}
}
