package com.alok.question1;

public class MainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator= new Calculator();
		
		
		
		System.out.println(calculator.add(4,5));
		System.out.println(calculator.add(4,5.0));
		System.out.println(calculator.multiply(4.6,5));
		
		System.out.println(calculator.div(4.6,0));
		System.out.println(calculator.div(0,5));
		
		
		

	}

}
