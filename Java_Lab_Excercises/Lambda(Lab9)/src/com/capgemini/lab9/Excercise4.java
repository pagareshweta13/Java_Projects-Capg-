package com.capgemini.lab9;

interface Emp
{
	Person get(String name);
}

class Person {
    private String name;
    
   Person()
    {
        System.out.println("Empty Constructor");
    }
   
    Person(String name) 
    {
         this.name = name;
    }
    
    public String toString() {
        return "name: " + name;
    }
}
  

public class Excercise4 {
	
public static void main(String[] args) 

{ 
		Emp e= Person::new ;
	    System.out.println(e.get("preeti"));
	 
}


}
