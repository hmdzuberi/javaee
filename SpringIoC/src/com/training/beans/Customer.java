package com.training.beans;

public class Customer {

	private String customerName;
	private long mobileNo;

	public Customer() {}

	public Customer(String customerName, long mobileNo) {

		super();
		this.customerName = customerName;
		this.mobileNo = mobileNo;
	}

	public String getCustomerName() {

		return customerName;
	}

	public void setCustomerName(String customerName) {

		this.customerName = customerName;
	}

	public long getMobileNo() {

		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {

		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {

		return "Customer [customerName=" + customerName + ", mobileNo=" + mobileNo + "]";
	}

}
