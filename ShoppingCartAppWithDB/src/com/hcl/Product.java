package com.hcl;

public class Product {
	private int productId;
	private String pname;
	private double price;
	private String category;
	
	public Product() {}

	public Product(int productId, String pname, double price, String category) {
		super();
		this.productId = productId;
		this.pname = pname;
		this.price = price;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
