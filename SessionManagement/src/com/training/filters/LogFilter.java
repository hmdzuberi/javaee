package com.training.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class LogFilter implements Filter {

	public LogFilter() {}

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		Logger log = Logger.getRootLogger();

		HttpServletRequest req = (HttpServletRequest) request;
		log.info("Request from: " + req.getRequestURL().toString());

		chain.doFilter(request, response);

		System.out.println("Post Processing");

		HttpServletResponse resp = (HttpServletResponse) response;

		resp.setContentType("text/html");
		resp.getWriter().append("Added by Post Processing from Filter");
	}

	public void init(FilterConfig fConfig) throws ServletException {}

}
