package com.alok.question2;

import java.util.Scanner;

class RetailCalculator {
	private Product[] products;

	public RetailCalculator() {
		products = new Product[3];
		products[0] = new Product("product1", 22.50);
		products[1] = new Product("product2", 44.50);
		products[2] = new Product("product3", 9.98);
	}

	public void productBilling() {
		Scanner scanner = new Scanner(System.in);
		double totalValue = 0;

		System.out.println("Enter the product number (1-3) and quantity sold.");
		System.out.println("Enter 0 for product number to quit.");

		while (true) {
			System.out.print("Enter product number (1-3) or 0 to QUIT: ");
			int productNum = scanner.nextInt();

			if (productNum == 0) {
				break;
			}
			if (productNum < 1 || productNum > 3) {
				System.out.println("Invalid product number! Enter number between 1 and 3.");
				continue;
			}

			System.out.print("Enter quantity sold: ");
			int quantitySold = scanner.nextInt();

			products[productNum - 1].sell(quantitySold);

			totalValue = 0;
			for (Product product : products) {
				totalValue += product.getTotalSalesValue();
			}
			System.out.print("Total value after this sale: " + totalValue);
		}
		System.out.print("Total retail value of all products sold: " + totalValue);

		scanner.close();
	}
}
