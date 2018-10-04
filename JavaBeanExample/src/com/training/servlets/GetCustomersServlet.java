package com.training.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.beans.Customer;
import com.training.dao.CustomerDAO;
import com.training.dao.impl.CustomerDAOImpl;
import com.training.utils.DbConnection;

public class GetCustomersServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public GetCustomersServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream stream = classLoader.getResourceAsStream("jdbc.properties");
		Connection con = DbConnection.getOracleConnection(stream);

		CustomerDAO customerDAO = new CustomerDAOImpl(con);
		List<Customer> customerList = null;

		try {
			customerList = customerDAO.getCustomers();
			System.out.println(customerList);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		request.setAttribute("customerList", customerList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShowCustomers.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
