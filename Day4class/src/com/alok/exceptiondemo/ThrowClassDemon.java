package com.alok.exceptiondemo;

import java.util.Scanner;

class DivideNumbers{
	
	private int n1;
	private int n2;
	private int res;
	
	
	
	public void setN1(int n1) {
		this.n1 = n1;
	}
	
	public void setN2(int n2) {
		if (n2==0) {
			// this is progamtically exception throw.
			throw new ArithmeticException("Divisor cannot be ZERO.");
		}
		this.n2 = n2;
	}
	public int getRes() {
		calculate();
		return res;
	}
	
	public void calculate() {
		res=n1/n2;
	}
	
}


public class ThrowClassDemon {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		DivideNumbers dn= new DivideNumbers();
		
		System.out.println("enter num1 ");
		int n1=sc.nextInt();
		dn.setN1(n1);
		
		System.out.println("enter num1 ");
		int n2=sc.nextInt();
		dn.setN2(n2);
		
		dn.getRes();
		
	}

}

// checked Age exception 18-60 fine
// employee class name, age, salary, phone
// salary unchecked exception --> negative salary
// phone exception checked  --> not 10 digit
