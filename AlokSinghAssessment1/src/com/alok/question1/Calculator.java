package com.alok.question1;

public class Calculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public double add(int num1, double num2) {
		return num1 + num2;
	}

	public double add(double num1, int num2) {
		return num1 + num2;
	}

	public double add(double num1, double num2) {
		return num1 + num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public double multiply(int num1, double num2) {
		return num1 * num2;
	}

	public double multiply(double num1, int num2) {
		return num1 * num2;
	}

	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public int diff(int num1, int num2) {
		return num1 - num2;
	}

	public double diff(int num1, double num2) {
		return num1 - num2;
	}

	public double diff(double num1, int num2) {
		return num1 - num2;
	}

	public double diff(double num1, double num2) {
		return num1 - num2;
	}

	public int div(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("Division by zero not possible!");
			return 0;
		} else
			return num1 / num2;
	}

	public double div(int num1, double num2) {
		if (num2 == 0) {
			System.out.println("Division by zero not possible!");
			return 0;
		}
		return num1 / num2;
	}

	public double div(double num1, int num2) {
		if (num2 == 0) {
			System.out.println("Division by zero not possible!");
			return 0;
		}
		return num1 / num2;
	}

	public double div(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Division by zero not possible!");
			return 0;
		}
		return num1 / num2;
	}

}
