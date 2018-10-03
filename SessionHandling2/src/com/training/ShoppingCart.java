package com.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShoppingCart() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		// Check for bookName
		String selectedBook = request.getParameter("bookName");
		if (selectedBook != null)
			session.setAttribute("book", selectedBook);

		System.out.println(selectedBook);

		// Check for mobileName
		String selectedPhone = request.getParameter("mobileName");
		if (selectedPhone != null)
			session.setAttribute("mobile", selectedPhone);

		System.out.println(selectedPhone);

		// Check for coupons
		String[] selectedCoupons = request.getParameterValues("coupons");
		if (selectedCoupons != null && selectedCoupons.length > 0)
			session.setAttribute("coupons", selectedCoupons);

		System.out.println(selectedCoupons);

		RequestDispatcher dispatcher = request.getRequestDispatcher("productpage.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
