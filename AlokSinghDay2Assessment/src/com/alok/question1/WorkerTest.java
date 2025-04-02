package com.alok.question1;

public class WorkerTest {
	public static void main(String[] args) {
		try {
			//vikas pay for daily 3000
			Worker dailyWorker = new DailyWorker("Vikas", 3000);        
			
			
			// Rahul pay for hourly 500
			Worker salariedWorker = new SalariedWorker("Rahul", 500); 

			int dailyWorkerPay = dailyWorker.pay(4); // 4 days 
			int salariedWorkerPay = salariedWorker.pay(33); // Fixed at 40 hours

			System.out.println(dailyWorker.name + "'s Weekly Pay: Rs " + dailyWorkerPay);
			System.out.println(salariedWorker.name + "'s Weekly Pay: Rs " + salariedWorkerPay);
		} catch (InvalidAgeException e) {
			System.out.println("AgeError: " + e.getMessage());
		} catch (InvalidNameException e) {
			System.out.println("NameErro: "+e.getMessage());
		}
	}
}