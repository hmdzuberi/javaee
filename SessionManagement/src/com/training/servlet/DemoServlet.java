package com.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DemoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DemoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());

		HttpSession session = request.getSession();

		session.setAttribute("city", "Bengaluru");

		System.out.println("Creation Time: " + session.getCreationTime());
		System.out.println("Last Accessed Time: " + session.getLastAccessedTime());

		session.removeAttribute("name");

		long timeElapsed = session.getLastAccessedTime() - session.getCreationTime();
		long inactiveTime = session.getMaxInactiveInterval();

		if (timeElapsed > inactiveTime)
			session.invalidate();

		System.out.println("Time Elapsed: " + timeElapsed);

		// session.invalidate();

		response.getWriter().println("<a href='info.jsp'>Back</a>");

		RequestDispatcher dispatcher = request.getRequestDispatcher("info.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
