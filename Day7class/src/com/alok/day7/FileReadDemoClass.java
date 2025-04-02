package com.alok.day7;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReadDemoClass {

	public static void main(String[] args) {
		try(FileInputStream fileInputStream=new FileInputStream("PersonDetails.txt");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);){
			
			Book b1=(Book)objectInputStream.readObject();
			System.out.println(b1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}