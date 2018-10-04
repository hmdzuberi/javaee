package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.beans.Customer;

public interface CustomerDAO {

	public int addCustomer(Customer customer) throws SQLException;

	public List<Customer> getCustomers() throws SQLException;

}
