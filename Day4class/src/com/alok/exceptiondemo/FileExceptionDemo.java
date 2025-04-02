//package com.alok.exceptiondemo;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//
//class FileOpenDemo{
//	
//	public void fileOpen(String name) {
//		
//		try {
//		FileInputStream fs=new FileInputStream(name);
//		System.out.println("file open");
//		}catch(FileNotFoundException fe) {
//			System.out.println("file not found exception handler");
//		}
//	}
//}
//
//
//public class FileExceptionDemo {
//	
//	public static void main(String[] args) {
//		
//		
////		Scanner sc=new Scanner(System.in);
//		
//		FileOpenDemo f=new FileOpenDemo();
//		f.fileOpen("/Day4class/src/com/alok/exceptiondemo/helloDemo");
//		
//	}
//
//}






package com.alok.exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;




class FileOpenDemo {
    
    public void fileOpen(String name) throws FileNotFoundException {
        // Attempting to open the file
        FileInputStream fs = new FileInputStream(name);
        System.out.println("File opened successfully.");
    }
}

public class FileExceptionDemo {
    
    public static void main(String[] args)  {
        
        // Instantiate the FileOpenDemo class
        FileOpenDemo f = new FileOpenDemo();
        
        try {
            
        	
            f.fileOpen("helloDemo.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found.");

        }
    }
}
