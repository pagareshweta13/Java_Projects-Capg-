package com.cg.lab6;
import java.util.*;
import java.util.Map.Entry;
import java.lang.*; 
  
public class Excercise1 { 
  
    
	
    public static  List<Entry<String,Integer>> sortByValue(HashMap<String, Integer> hm) 
    { 
        
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        return list; 
    } 
  
    
    public static void main(String[] args) 
    { 
  
        HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
  
         
        hm.put("C", 98); 
        hm.put("CPP", 85); 
        hm.put("Database", 91); 
        hm.put("Java", 95); 
        hm.put("Python", 79); 
        hm.put("Java Script", 80); 
      
        List<Map.Entry<String, Integer> > list=sortByValue(hm);
        System.out.println(list);
         
    } 
}