package com.alok.question1;

//SalariedWorker class
class SalariedWorker extends Worker {
	public SalariedWorker(String name, int salaryRate) throws InvalidAgeException, InvalidNameException {
		super(name, salaryRate);
	}

	
	// to compute the week pay of every worker
	// so for a week  even if worker work MORE THAN 40 HOURS get pay only for 40 hours.
	@Override
	public int pay(int hours) {
		
		if(hours>40) {
			return salaryRate*40;
		}
		
		return salaryRate * hours; 
	}
}
