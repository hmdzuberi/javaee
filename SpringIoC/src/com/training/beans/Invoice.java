package com.training.beans;

import java.util.List;
import java.util.logging.Logger;

public class Invoice {

	private long invoiceNo;
	private Customer customer;
	private double invoiceAmount;
	private List<Product> productList;

	private static Logger log = Logger.getAnonymousLogger();

	public Invoice() {

		log.info("Invoice Initialized");
	}

	public Invoice(long invoiceNo, Customer customer) {

		super();
		this.invoiceNo = invoiceNo;
		this.customer = customer;
		this.invoiceAmount = getInvoiceAmount();
	}

	public long getInvoiceNo() {

		return invoiceNo;
	}

	public void setInvoiceNo(long invoiceNo) {

		this.invoiceNo = invoiceNo;
	}

	public Customer getCustomer() {

		return customer;
	}

	public void setCustomer(Customer customer) {

		this.customer = customer;
	}

	public double getInvoiceAmount() {

		double total = 0;

		for (Product eachProduct : productList) {
			total += (eachProduct.getQuantity() * eachProduct.getRatePerUnit());
		}

		return total;
	}

	public void setInvoiceAmount(double invoiceAmount) {

		this.invoiceAmount = invoiceAmount;
	}

	public List<Product> getProductList() {

		return productList;
	}

	public void setProductList(List<Product> productList) {

		this.productList = productList;
	}

	@Override
	public String toString() {

		return "Invoice [invoiceNo=" + invoiceNo + ", customer=" + customer + ", invoiceAmount=" + invoiceAmount
				+ ", productList=" + productList + "]";
	}

}
