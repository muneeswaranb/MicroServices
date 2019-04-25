package com.metoojava.microservices.productcatalogservice.model;

public class Item {
	
	private String productId;
	private String productDescription;
	private double price;
	
	public Item(String productId, String productDesc, double price)	{
		this.productId=productId;
		this.productDescription=productDesc;
		this.price=price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productDescription;
	}
	public void setProductName(String productName) {
		this.productDescription = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
