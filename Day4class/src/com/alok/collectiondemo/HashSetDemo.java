package com.alok.collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
    	
    	
    	
        Set<String> names = new HashSet<>();
        
        

        // Adding elements to the HashSet
        names.add("Alok");
        names.add("Singh");
        names.add("Developer");
        names.add("Java");
        names.add("Alok"); // Duplicate entry, will not be added
        
        System.out.println(names);
        
//        names.remove("Alok");

        
        
        
        Set<Integer> llhashset=new LinkedHashSet<Integer>();
        
        
        
       
        
        
        
        
        Iterator<String> itertor=names.iterator();
        while(itertor.hasNext()) {
        	System.out.println(itertor.next());
        }
        
        
        
        
        
        
        
        
        
        System.out.println("HashSet elements:");
        for (String name : names) {
            System.out.println(name);
        }

     
        if (names.contains("Java")) {
            System.out.println("Java is in the HashSet.");
        }

        names.remove("Singh");
        System.out.println("After removing 'Singh': " + names);

        // Checking the size of the HashSet
        System.out.println("Size of HashSet: " + names.size());
    }
}
