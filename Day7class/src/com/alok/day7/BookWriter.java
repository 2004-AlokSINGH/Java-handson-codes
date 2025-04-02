package com.alok.day7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BookWriter{

	public static void main(String[] args) {
try(FileOutputStream fileOutputStream=new FileOutputStream("PersonDetails.txt");
				
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
				){
			
			Book b1=new Book(1,"harryPotter");
			objectOutputStream.writeObject(b1);
			System.out.println("File created");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
