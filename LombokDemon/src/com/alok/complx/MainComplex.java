package com.alok.complx;

public class MainComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complex c1=new Complex(3,5);
		
		Complex c2=new Complex();
		c2.setReal(3);
		c2.setImaginary(5);
		
		
		Complex c3=new Complex();
		c3.sum(c1,c2);
		
	
		

	}

}
