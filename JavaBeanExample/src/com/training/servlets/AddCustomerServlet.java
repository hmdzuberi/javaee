package com.training.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jdbc.pool.DataSource;

import com.training.beans.Customer;
import com.training.dao.CustomerDAO;
import com.training.dao.impl.CustomerDAOImpl;

public class AddCustomerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Connection con;

	public AddCustomerServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customerBean");

		System.out.println(customer);

		int customerAdded = 0;
		CustomerDAO customerDAO = new CustomerDAOImpl(con);

		try {
			customerAdded = customerDAO.addCustomer(customer);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		request.setAttribute("customerAdded", customerAdded + " customer added");

		RequestDispatcher dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	@Override
	public void init() throws ServletException {

		try {
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc.ds1");
			con = dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
