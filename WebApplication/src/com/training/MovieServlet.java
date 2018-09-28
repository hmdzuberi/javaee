package com.training;

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

import com.training.dao.impl.MovieDAOImpl;
import com.training.entity.DAO;
import com.training.entity.Movie;
import com.training.utils.DbConnection;

/**
 * Servlet implementation class MovieServlet
 */
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MovieServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		InputStream stream = classLoader.getResourceAsStream("jdbc.properties");
		System.out.println(stream);

		Connection con = DbConnection.getOracleConnection(stream);
		System.out.println(con);

		DAO<Movie> dao = new MovieDAOImpl(con);
		RequestDispatcher dispatcher = request.getRequestDispatcher("showMovies.jsp");

		try {
			List<Movie> foundList = dao.findAll();
			request.setAttribute("movieList", foundList);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
