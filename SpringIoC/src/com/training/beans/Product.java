package com.training.beans;

public class Product {

	private long productId;
	private String productName;
	private double ratePerUnit;
	private double quantity;

	public Product() {}

	public Product(long productId, String productName, double ratePerUnit, double quantity) {

		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.quantity = quantity;
	}

	public long getProductId() {

		return productId;
	}

	public void setProductId(long productId) {

		this.productId = productId;
	}

	public String getProductName() {

		return productName;
	}

	public void setProductName(String productName) {

		this.productName = productName;
	}

	public double getRatePerUnit() {

		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {

		this.ratePerUnit = ratePerUnit;
	}

	public double getQuantity() {

		return quantity;
	}

	public void setQuantity(double quantity) {

		this.quantity = quantity;
	}

	@Override
	public String toString() {

		return "Product [productId=" + productId + ", productName=" + productName + ", ratePerUnit=" + ratePerUnit
				+ ", quantity=" + quantity + "]";
	}

}
