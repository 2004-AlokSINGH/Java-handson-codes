package com.alok.serialdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileCreateDemoClass {

	public static void main(String[] args) {
		
		try(FileOutputStream fileOutputStream=new FileOutputStream("EmployeeDet.txt");
				
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
				){
			
			Librarian person=new Librarian("amanBookStore", "Akash", new Book(101, "Bookie-M"));
			objectOutputStream.writeObject(person);
			System.out.println("File created");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}