package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		boolean isValidUser = false;
		String errMessage = "Invalid username or password";

		if (username.equals("india") && password.equals("india")) {
			isValidUser = true;
			session.setAttribute("isLoggedIn", "true");
		} else {
			request.setAttribute("errMessage", errMessage);
			session.setAttribute("isLoggedIn", "false");
		}

		RequestDispatcher dispatcher;

		if (isValidUser)
			dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
		else
			dispatcher = request.getRequestDispatcher("");

		dispatcher.forward(request, response);
	}

}
