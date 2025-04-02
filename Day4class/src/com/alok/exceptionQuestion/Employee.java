package com.alok.exceptionQuestion;

/*
 * 
// checked Age exception 18-60 fine
// employee class name, age, salary, phone
// salary unchecked exception --> negative salary
// phone exception checked  --> not 10 digit
 */



public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private long phoneNum;
	
	
	
	public Employee(String name, int age, double salary, long phoneNum) throws AgeCheckedException, PhoneCheckedException {
		super();
		this.name = name;
		if(age<=0 || age>60)
			throw new AgeCheckedException("age cannot be greater than 60 and less than 1");
		this.age = age;
		if (salary<1000) {
			throw new SalaryUncheckedException("salary must not be greater 3 digit ");
		}

		this.salary = salary;
		
		if (phoneNum<999999999){
			throw new PhoneCheckedException("Phone number must be of 10 digit");
		}
		this.phoneNum = phoneNum;
	}
	
	
	
	
	

}
