package com.alok.complx;

import lombok.Data;

@Data
public class Complex {

	private int real, imaginary;

	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex() {
	}

	public void sum(Complex c1, Complex c2) {
		int r = c1.getReal() + c2.getReal();
		int c = c1.getImaginary() + c2.getImaginary();

	}

}
