package com.training.util;

import java.util.HashMap;

import com.training.beans.Customer;

public class CustomerDetails {

	private static HashMap<Long, Customer> customerList;

	static {

		customerList = new HashMap<>();

		customerList.put(101L, new Customer(101, "Ramesh", 484848L));
		customerList.put(102L, new Customer(102, "Ganesh", 565656L));
	}

	public static Customer getCustomer(long key) {

		return customerList.get(key);
	}

	public static HashMap<Long, Customer> getAllCustomer() {

		return customerList;
	}

	public static String addCustomer(Customer customer) {

		String message = "Added";
		Customer oldCustomer = customerList.put(customer.getCustomerId(), customer);

		if (oldCustomer != null)
			message = "Replaced";

		return message;
	}

}
