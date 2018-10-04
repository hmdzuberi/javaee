package com.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.training.beans.Customer;
import com.training.dao.CustomerDAO;

public class CustomerDAOImpl implements CustomerDAO {

	private Connection con;

	public CustomerDAOImpl(Connection con) {

		this.con = con;
	}

	@Override
	public int addCustomer(Customer customer) throws SQLException {

		int customerAdded = 0;

		String sql = "insert into hz_customers values (?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setLong(1, customer.getCustomerId());
		pstmt.setString(2, customer.getCustomerName());
		pstmt.setLong(3, customer.getMobileNumber());

		customerAdded = pstmt.executeUpdate();
		System.out.println(customerAdded);

		return customerAdded;
	}

}
