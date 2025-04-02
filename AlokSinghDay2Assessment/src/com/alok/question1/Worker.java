package com.alok.question1;

/*
 * Create a class called Worker. 
 * Write classes DailyWorker and SalariedWorker that inherit from Worker.
 * Every worker has a name and a salaryRate. Write method Pay (int hours) to compute the week pay of every worker.  
	A Daily worker is paid on the basis of the number of days she/he works.
	The salaried worker gets paid the wage for 40 hours a week no matter what the actual hours are. 
	Test this program to calculate the pay of workers. 
 
 Also Create user defined exceptions to check that name cannot be left blank and 
 salaryRate can only be the positive Integer .

 */


public abstract class Worker {
	
	// Using PROTECTED as implementing inheritance as we need 
	protected String name;
	protected int salaryRate;

		// Constructor
		public Worker(String name, int salaryRate) throws InvalidAgeException, InvalidNameException {
		  if (name == null || name.trim().isEmpty()) {
		      throw new InvalidNameException("Worker name cannot be blank.");
		  }
		  if (salaryRate <= 0) {
		      throw new InvalidAgeException("Salary rate must be a positive integer.");
		  }
		  this.name = name;
		  this.salaryRate = salaryRate;
		}
		
			
		// creating pay method as worker object can call pay method.
		//to compute the week pay of every worker
		 public abstract int pay(int hours);

}

