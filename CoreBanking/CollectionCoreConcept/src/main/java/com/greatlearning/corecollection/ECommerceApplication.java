package com.greatlearning.corecollection;

import java.util.LinkedList;
import java.util.List;

class Product {
	private int productId;

	private String productName;

	private double productPrice;

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}

public class ECommerceApplication {
	public static void main(String[] args) {

		List<Product> products = new LinkedList<Product>();

		products.add(new Product(121, "MI SMART TV", 89898.99));
		products.add(new Product(122, "APPLE PHONE", 450.99));
		products.add(new Product(123, "HP LAPTOP", 456.99));
		products.add(new Product(124, "LENOVO LAPTOP", 55500.99));
		products.add(new Product(125, "SAMSUNG TV", 110.99));
		
		products.stream().filter(prod->prod.getProductPrice()>50000).forEach(System.out::println);

	}
}
