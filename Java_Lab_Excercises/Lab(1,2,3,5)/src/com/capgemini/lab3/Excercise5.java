package com.capgemini.lab3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Excercise5 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader r=null;
		
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		
		try {
			r=new BufferedReader(new FileReader("C:\\Users\\acer\\Desktop\\sample.txt"));
			String cr=r.readLine();
			while(cr!=null)
			{
				lineCount++;
				String ws[]=cr.split(" ");
				wordCount+=ws.length;
				
				for(String w:ws)
				{
					charCount+=+w.length();
				}
				cr=r.readLine();
				
			}
			System.out.println("No Of Char"+charCount);
			System.out.println("No Of Words"+wordCount);
			System.out.println("No Of Lines"+lineCount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
