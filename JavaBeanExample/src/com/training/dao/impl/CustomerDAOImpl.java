package com.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Customer> getCustomers() throws SQLException {

		List<Customer> customerList = new ArrayList<>();

		String sql = "select * from hz_customers";
		PreparedStatement pstmt = con.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			Customer customer = new Customer();

			customer.setCustomerId(rs.getLong("customerId"));
			customer.setCustomerName(rs.getString("customerName"));
			customer.setMobileNumber(rs.getLong("mobileNumber"));

			customerList.add(customer);
		}

		return customerList;
	}

}
