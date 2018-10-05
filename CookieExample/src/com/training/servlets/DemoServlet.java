package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DemoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String searchItem = request.getParameter("itemName");
		String selectedColor = request.getParameter("color");

		System.out.println(selectedColor);

		Cookie cookieSearchedItem = new Cookie("searchedItem", searchItem);
		Cookie cookieSelectedColor = new Cookie("selectedColor", selectedColor);

		response.addCookie(cookieSearchedItem);
		response.addCookie(cookieSelectedColor);

		RequestDispatcher dispatcher = request.getRequestDispatcher("catalog.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
