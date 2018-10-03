package com.training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LifeCycle() {
		super();

		System.out.println("Constructor called.");
		// System.out.println("Constructor called. " +
		// getServletConfig().getServletName());
	}

	@Override
	public void init() throws ServletException {

		System.out.println("Init method called. " + getServletConfig().getServletName());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet called.");
		response.getWriter().append("doGet called ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	@Override
	public void destroy() {

		System.out.println("Servlet destroyed.");
	}

}
