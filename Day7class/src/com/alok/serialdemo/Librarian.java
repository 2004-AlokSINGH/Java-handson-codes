package com.alok.serialdemo;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Librarian  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String libarayname;
	private String librarianname;
	transient private Book book;
	
	
	
	public String getLibarayname() {
		return libarayname;
	}
	public void setLibarayname(String libarayname) {
		this.libarayname = libarayname;
	}
	public String getLibrarianname() {
		return librarianname;
	}
	public void setLibrarianname(String librarianname) {
		this.librarianname = librarianname;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Librarian(String libarayname, String librarianname, Book book) {
		super();
		this.libarayname = libarayname;
		this.librarianname = librarianname;
		this.book = book;
	}
	
	
	
	private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
	    objectOutputStream.defaultWriteObject();
	    objectOutputStream.writeObject(book.getId());   // Write id first
	    objectOutputStream.writeObject(book.getName()); // Write name second
	}

	
	
	private void readObject(ObjectInputStream objInputStream) throws ClassNotFoundException, IOException {
		objInputStream.defaultReadObject();
		book=new Book((int)objInputStream.readObject(),
				(String)objInputStream.readObject());
		
	}
	@Override
	public String toString() {
		return "Librarian [libarayname=" + libarayname + ", librarianname=" + librarianname + ", book=" + book + "]";
	}

}


