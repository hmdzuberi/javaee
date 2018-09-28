package com.training;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

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
 * Servlet implementation class AddMovieServlet
 */
public class AddMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddMovieServlet() {
		super();
		// TODO Auto-generated constructor stub
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

		String strMovieID = request.getParameter("movieID");
		String movieName = request.getParameter("movieName");
		String director = request.getParameter("director");
		String genre = request.getParameter("genre");
		String strRating = request.getParameter("rating");

		long movieID = Long.parseLong(strMovieID);
		Double rating = Double.parseDouble(strRating);

		Movie movie = new Movie(movieID, movieName, director, genre, rating);

		RequestDispatcher dispatcher = null;

		int rowAdded = 0;
		String target = null;

		try {
			rowAdded = dao.add(movie);
			target = "success.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			target = "failure.jsp";
		}

		request.setAttribute("rowAdded", rowAdded);

		dispatcher = request.getRequestDispatcher(target);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
