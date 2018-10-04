package com.training.dao;

import java.sql.SQLException;

import com.training.beans.Customer;

public interface CustomerDAO {

	public int addCustomer(Customer customer) throws SQLException;

}
