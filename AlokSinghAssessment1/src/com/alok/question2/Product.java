package com.alok.question2;

class Product {

	private String name;
	private double price;
	private int quantitySold;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void sell(int quantity) {
		this.quantitySold += quantity;
	}

	public double getTotalSalesValue() {
		return price * quantitySold;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantitySold() {
		return quantitySold;
	}
}
