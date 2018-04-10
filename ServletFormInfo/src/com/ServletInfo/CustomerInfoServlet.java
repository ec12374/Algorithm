package com.ServletInfo;

import java.io.*;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerInfoServlet
 */
@WebServlet("/CustomerInfoServlet")
public class CustomerInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	// no use in this context
	public void init() {
		System.out.println("--------------------------");
		System.out
				.println("init method has been called and servlet is initialized.");
		System.out.println("--------------------------");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<b>Using separate getParameter method:</b> " + "<br />"
				+ "<br />");
		out.println("FirstName: " + request.getParameter("first_name")
				+ "<br />");
		out.println("LastName: " + request.getParameter("last_name") + "<br />"
				+ "<br />");

		// It will get all parameters associated in request
		Enumeration<String> paramNames = request.getParameterNames();

		out.println("<b>Using Enumeration object:</b> " + "<br />" + "<br />");
		while (paramNames.hasMoreElements()) {

			String paramName = paramNames.nextElement();
			out.print("  " + paramName + ": ");
			String paramValue = request.getParameter(paramName);
			out.print(paramValue + "<br />");
		}
		out.println("<br />");
		out.println("<b>Using Map object:</b> " + "<br />" + "<br />");
		// Using HashMap key value concept

		Map<String, String[]> paramMap = request.getParameterMap();
		Set<String> paramNamesSet = paramMap.keySet();

		for (String paramName : paramNamesSet) {

			out.print(paramName + ": ");
			String[] paramValue = paramMap.get(paramName);
			for (int i = 0; i < paramValue.length; ++i) {
				out.println(paramValue[i] + " ");
			}
			// this is working but o/p is like
			// [Tushar]out.println(Arrays.toString(paramValue));
			out.println("<br />");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<b>Using separate getParameter method:</b> " + "<br />"
				+ "<br />");
		out.println("FirstName: " + request.getParameter("first_name")
				+ "<br />");
		out.println("LastName: " + request.getParameter("last_name") + "<br />"
				+ "<br />");

		// It will get all parameters associated in request
		Enumeration<String> paramNames = request.getParameterNames();

		out.println("<b>Using Enumeration object:</b> " + "<br />" + "<br />");
		while (paramNames.hasMoreElements()) {

			String paramName = paramNames.nextElement();
			out.print("  " + paramName + ": ");
			String paramValue = request.getParameter(paramName);
			out.print(paramValue + "<br />");
		}
		out.println("<br />");
		out.println("<b>Using Map object:</b> " + "<br />" + "<br />");
		// Using HashMap key value concept

		Map<String, String[]> paramMap = request.getParameterMap();
		Set<String> paramNamesSet = paramMap.keySet();

		for (String paramName : paramNamesSet) {

			out.print(paramName + ": ");
			String[] paramValue = paramMap.get(paramName);
			for (int i = 0; i < paramValue.length; ++i) {
				out.println(paramValue[i] + " ");
			}
			// this is working but o/p is like
			// [Tushar]out.println(Arrays.toString(paramValue));
			out.println("<br />");
		}

	}

	// no use in this context
	public void destroy() {
		System.out.println("-----------------");
		System.out.println("Destroy method has been called");
		System.out.println("-----------------");
	}
}
