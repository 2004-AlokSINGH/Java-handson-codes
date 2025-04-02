package com.alok.serialdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReadDemoClass {

	public static void main(String[] args) {
		try(FileInputStream fileInputStream=new FileInputStream("EmployeeDet.txt");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);){
			
			Librarian person=(Librarian)objectInputStream.readObject();
			System.out.println(person);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}