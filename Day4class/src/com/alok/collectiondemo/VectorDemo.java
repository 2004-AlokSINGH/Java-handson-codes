package com.alok.collectiondemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.ArrayList;
import java.util.List;

public class VectorDemo {





    public static void main(String[] args) {
    	
    	
        Vector<Integer> collection = new Vector<>();

        // Adding elements to the ArrayList
        collection.add(10);
        collection.add(20);
        collection.add(30);
        collection.add(40);
        collection.add(10); // Duplicate is allowed in ArrayList

        // Displaying the ArrayList
        System.out.println("ArrayList elements: " + collection);

        if (collection.contains(30)) {
            System.out.println("30 is present in the ArrayList.");
        }
        
        for(int i=0;i<collection.size();i++) {
        	System.out.println(collection.get(i));
        }
        
        ListIterator <Integer> listIterator=collection.listIterator();
        while(listIterator.hasNext()) {
        	listIterator.next();
        }
        while (listIterator.hasPrevious()) {
        	System.out.println(listIterator.previous());
        }
        
        Enumeration <Integer> enumrEnumeration=collection.elements();
        while(enumrEnumeration.hasMoreElements()) {
        	System.out.println(enumrEnumeration.nextElement());
        }
        		

        
        collection.remove(Integer.valueOf(20));
        System.out.println("After removing 20: " + collection);

        // Checking the size of the ArrayList
        System.out.println("Size of ArrayList: " + collection.size());
    }
}
