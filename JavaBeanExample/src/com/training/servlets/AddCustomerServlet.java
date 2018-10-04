package com.training.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.beans.Customer;
import com.training.dao.CustomerDAO;
import com.training.dao.impl.CustomerDAOImpl;
import com.training.utils.DbConnection;

public class AddCustomerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AddCustomerServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream stream = classLoader.getResourceAsStream("jdbc.properties");
		Connection con = DbConnection.getOracleConnection(stream);

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

}
