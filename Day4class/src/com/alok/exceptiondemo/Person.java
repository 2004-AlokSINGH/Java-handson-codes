package com.alok.exceptiondemo;

public class Person {

	
	private String name;
	private int age;
	
	
	public Person(String name, int age) throws AgeCheckedException {
//		super();
		this.name = name;
		if(age>60) {
			throw new AgeCheckedException("age cant be > 61");
		}
		this.age = age;
	}
	
	
	
	
}
