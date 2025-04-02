package com.alok.question1;

////DailyWorker class
class DailyWorker extends Worker {
	public DailyWorker(String name, int salaryRate) throws InvalidAgeException, InvalidNameException {
		super(name, salaryRate);
	}

	@Override
	public int pay(int noOfDays) {
		if(noOfDays>6) {
			return salaryRate*6;  //Assuming the maximum working DAYS in a week is 6
		}
		return noOfDays * salaryRate;
	}
}
